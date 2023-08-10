salario = float(input("Digite seu salário: "))
aumento = float(input("Digite o percentual de aumento: "))
#Processamento
valor_aumento = float(salario) * float(aumento) / 100
novo_salario = salario + float(valor_aumento)
# Saida
print(f"Seu salário vai aumentar para:  {round(novo_salario,2)}, com aumento de: {valor_aumento:.2f}")