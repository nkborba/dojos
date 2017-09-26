"""
Python #4 Campinas
DOJO de Phython
Nicholas Bobra
26/09/2017
"""

NOTAS = {'100': 100, '50': 50, '20': 20, '10': 10}
VALOR = 1380

for x, y in sorted(NOTAS.items(), key=lambda i: i[1], reverse=True):
    print(str(int(VALOR/NOTAS[x]))+' notas de: '+str(NOTAS[x]))
    VALOR = VALOR % NOTAS[x]
