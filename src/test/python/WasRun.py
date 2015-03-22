from TestCase import TestCase


class WasRun(TestCase):
    def __init__(self, name):
        self.wasRun = None
        TestCase.__init__(self, name)

    def set_up(self):
        self.wasRun = None
        self.wasSetUp = 1
        self.log = "set_up "

    def test_method(self):
        self.wasRun = 1
        self.log = self.log + "test_method "

    def tear_down(self):
        self.log = self.log + "tear_down "

    def test_broke_method(self):
        raise Exception