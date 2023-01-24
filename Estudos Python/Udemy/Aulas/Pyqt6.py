import sys

from PyQt6.QtWidgets import QMainWindow, QApplication, QPushButton, QWidget, QGridLayout

class App(QMainWindow):
    def __init__(self, parent=None):
        super().__init__(parent)
        
        self.cw = QWidget()
        self.grid = QGridLayout()
        self.btn = QPushButton('Texto do botão')
        self.grid.addWidget(self.btn, 0, 0, 1, 1)
        self.setCentralWidget(self.cw)
        
if __name__=='_main_':
    
    qt = QApplication(sys.argv)
    app = App()
    app.show()
    qt.exec_()