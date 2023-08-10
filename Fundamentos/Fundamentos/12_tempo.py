print("!!!!Programa para calcular a quantidade de segundos informados pelo usuario!!!!")
# entrada de valores
dia = int(input("Digite a quantidade de dias: "))
hora = int(input("Digite a quantidade de horas: "))
minuto = int(input("Digite a quantidade de minutos: "))
segundo = int(input("Digite a quantidades de segundos: "))
# Calculo do quantidade de segundos
dia = dia * 3600 * 24
hora = hora * 3600
minuto = minuto * 60
total = dia + hora + minuto + segundo
# Imprimindo na tela o resultado
print("Total de segundos: ", total)
