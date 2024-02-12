class Product:
    def __init__(self, name, price):
        self.name = name
        self.price = price

class ShoppingCart:
    def __init__(self):
        self.items = []

    def add_item(self, product, quantity):
        self.items.append({"product": product, "quantity": quantity})

    def calculate_total(self):
        total = 0
        for item in self.items:
            total += item["product"].price * item["quantity"]
        return total

def main():
    cart = ShoppingCart()

    # Produkte erstellen
    product1 = Product("Hemd", 20)
    product2 = Product("Hose", 30)
    product3 = Product("Schuhe", 50)

    # Produkte zum Warenkorb hinzufügen
    cart.add_item(product1, 2)
    cart.add_item(product2, 1)
    cart.add_item(product3, 1)

    # Gesamtpreis berechnen und ausgeben
    total_price = cart.calculate_total()
    print("Gesamtpreis: $" + str(total_price))

if __name__ == "__main__":
    main()
