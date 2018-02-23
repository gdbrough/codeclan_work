import unittest
from Cake import Cake

class TestCake(unittest.TestCase):
    def setUp(self):
        ingredients = ["Sugar", "Flour", "Chocolate"]
        self.cake = Cake("Brownie", ingredients)

    def test_cake_has_name(self):
        self.assertEquals("Brownie", self.cake.name)

    def test_cake_has_three_ingredients(self):
        self.assertEquals(3, len(self.cake.ingredients))

    def test_cake_can_bake(self):
        self.assertEquals("We're baking a Brownie", self.cake.bake())

unittest.main()
