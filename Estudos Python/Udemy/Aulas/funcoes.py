def funcao(msg='olá', nome='usuário'):
    return f'{msg} {nome}'

# Higher Order Functions e First-Class Functions
def saudacao(msg):
    return msg

def executa(funcao, msg):
    return funcao(msg)

v = executa(saudacao, 'Bom dia')

# Closure e funções que retornam outras funções.
def criar_saudacao(saudacao, nome):
    def saudar():
        return f'{saudacao}, {nome}!'
    return saudar

s1 = criar_saudacao('Bom dia', 'Fernando')
s2 = criar_saudacao('Boa noite', 'Fernando')

print(s1())
print(s2())