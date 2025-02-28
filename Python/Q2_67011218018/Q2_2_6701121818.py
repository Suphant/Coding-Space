import socket

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
host = '127.0.0.1'
port = 9090

server_socket.bind((host, port))
server_socket.listen(1)
print(f"Server is listening on {host}:{port}")

user_count = []
while True:
    client_socket, client_adress = server_socket.accept()
    print(f"Connect from{client_adress}")

    try:
        data = client_socket.recv(1024).decode('utf-8')
        response = (f"Server: welcome {data}\n")
        user_count.append(data)
        client_socket.send(response.encode('utf-8'))
        
        for i in user_count:
            active_user = (f"Server: active users: {i}")
            client_socket.send(active_user.encode('utf-8'))

        message = client_socket.recv(1024).decode('utf-8')
        message_display = f"{data}: {message} "
        client_socket.send(message_display.encode('utf-8'))
    except Exception as e:
        print(f"Error: {e}")