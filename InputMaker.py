import random, string
for n in (1000, 10000, 100000):
    words = set()
    while len(words) < n:
        words.add(''.join(random.choices(string.ascii_lowercase, k=random.randint(5, 10))))
    words = list(words)
    random.shuffle(words)
    with open(f'input_{n}.txt', 'w') as f:
        f.write(f'{n}\n' + '\n'.join(words) + '\n')