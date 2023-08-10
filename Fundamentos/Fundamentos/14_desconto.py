# PROGRAMA PARA CALCULAR O DESCONTO SOBRE UM PRODUTO
#Entrada de dados
nome = input("Digite o nome do produto: ")
preco = float(input("Digite o preço do produto: "))
desconto = float(input("Digite o percentual de desconto: "))
#Calculo do desconto
preco_final = preco-(preco*(desconto/100))
print(f"preço final do produto R${preco_final}")