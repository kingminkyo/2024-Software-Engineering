def with_milk(f):
    def wrapper(*args):
        coffee = f(*args)
        return Coffee(f"{coffee.description} (우유 추가)", coffee.cost + 100)
    return wrapper

def with_mocha(f):
    def wrapper(*args,):
        coffee = f(*args)
        return Coffee(f"{coffee.description} (모카 추가)", coffee.cost + 200)
    return wrapper


class Coffee:
    def __init__(self, description, cost):
        self.description = description
        self.cost = cost

    def __repr__(self):
        return f"{self.description} ({self.cost}원)"


@with_milk
@with_mocha
def espresso():
    return Coffee("에스프레소", 2000)


@with_mocha
def decaf():
    return Coffee("디카페인", 2700)

print(espresso())  # 에스프레소에 모카와 우유 추가
print(decaf())     # 디카페인에 모카 추가
