# 3-2-DesignPatterns-FootShapeApplication
- Start OOP with aggregation and dependency relationship.

### 👯‍ Relationship 👯
``` 
Foot <>⎯⎯⎯➔ FootShape

FootShape -------➔ Ellipse
FootShape -------➔ Rectangle
```

### 📦 Class 📦
```
Foot
    draw()
    
FootShape
    drawAsEllipse()
    drawAsRectangle()
    
Ellipse
    draw()

Rectangle
    draw()
```