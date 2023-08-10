cidade_saida = input("Digite a cidade de saida:")
cidade_destino = input("Digite de destino: ")
distancia = float(input("Digite a distancia da cidade de destino: "))
km_l = float(input("Digite  o consumo de cobustivel do seu carro Km/l: "))
combustivel = input("Digite o conbustivel a ser utlizado: ")
preco_combustivel = float(input("Digite o preço do combustivel: "))
consumo = distancia / km_l
valor_da_viagem = float(consumo)*float(preco_combustivel)
print(f"Consumo de {combustivel} entre {cidade_saida} e {cidade_destino} {consumo:.2f}Litros ao valor de R${valor_da_viagem:.2f}")