```groovy
def unusualBug() {
  def list = [1, 2, 3]
  list.eachWithIndex { item, index ->
    if (item == 2) {
      list.remove(item) // This causes an issue with concurrent modification
    }
    println "Item: $item, Index: $index"
  }
}

unusualBug()
```