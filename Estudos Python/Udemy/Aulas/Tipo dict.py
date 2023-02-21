pessoa = {
    'nome': 'Fernando Alves',
    'sobrenome': 'Araujo',
    'idade': 33,
    'altura': 1.85,
    'endereço': [{'Rua': 'Jonatas Serrano', 'numero': 578}]

}

print(pessoa['nome'])
print(type(pessoa))
print()

for c in pessoa:
    print(c, pessoa[c])