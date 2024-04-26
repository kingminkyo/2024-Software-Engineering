def with_milk(dd):
    def wraappers(*aa):
        coffee = dd(*aa)
        return Coffee(f"{coffee.description} (우유 추가)", coffee.cost + 100)
    return wraappers

def with_mocha(dd):
    def wrappers(*aab):
        coffee = dd(*aab)
        return Coffee(f"{coffee.description} (모카 추가)", coffee.cost + 200)
    return wrappers


class Coffee:
    def __init__(self, description, cost):
        self.description = description
        self.cost = cost

    def __repr__(self):
        return f"{self.description} ({self.cost}원)"


@with_milk
@with_mocha
@with_mocha
@with_mocha
def espresso():
    return Coffee("에스프레소", 2000)


@with_mocha
def decaf():
    return Coffee("디카페인", 2700)

print(espresso())  # 에스프레소에 모카와 우유 추가
print(decaf())     # 디카페인에 모카 추가
