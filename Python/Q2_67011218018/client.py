import socket

client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
host = '127.0.0.1'
port = 9090
try:
    client_socket.connect((host, port))
    user_name = input("Enter username: ")
    
    while True:
        client_socket.send(user_name.encode('utf-8'))
        response = client_socket.recv(1024).decode('utf-8')
        print(response)
        message = input(f"{user_name}: ")
        client_socket.send(message.encode('utf-8'))
        message_display = client_socket.recv(1024).decode('utf-8')
        print(message_display)
        
except Exception as e:
    print(f'Error {e}')