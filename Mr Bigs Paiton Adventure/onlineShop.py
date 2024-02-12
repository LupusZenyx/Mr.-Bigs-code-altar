import sqlite3

class Product:
    def __init__(self, name, price):
        self.name = name
        self.price = price

def create_database():
    connection = sqlite3.connect("webshop.db")
    cursor = connection.cursor()

    cursor.execute('''CREATE TABLE IF NOT EXISTS products
                      (id INTEGER PRIMARY KEY, name TEXT, price REAL)''')

    connection.commit()
    connection.close()

def add_product(product):
    connection = sqlite3.connect("webshop.db")
    cursor = connection.cursor()

    cursor.execute("INSERT INTO products (name, price) VALUES (?, ?)", (product.name, product.price))

    connection.commit()
    connection.close()

def main():
    create_database()

    # Produkte erstellen und zur Datenbank hinzufügen
    products = [Product("Hemd", 20), Product("Hose", 30), Product("Schuhe", 50)]
    for product in products:
        add_product(product)

    # Produkte aus der Datenbank abrufen und ausgeben
    connection = sqlite3.connect("webshop.db")
    cursor = connection.cursor()

    cursor.execute("SELECT * FROM products")
    all_products = cursor.fetchall()

    print("Alle Produkte:")
    for product in all_products:
        print(f"{product[1]} - ${product[2]}")

    connection.close()

if __name__ == "__main__":
    main()
