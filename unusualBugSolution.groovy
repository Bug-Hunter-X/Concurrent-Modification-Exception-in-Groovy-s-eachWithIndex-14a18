```groovy
def safeModification() {
  def list = [1, 2, 3]
  def iterator = list.iterator() //Use an iterator for safe removal
  while (iterator.hasNext()) {
    def item = iterator.next()
    if (item == 2) {
      iterator.remove()
    }
    println "Item: $item"
  }
  println list
}

def safeModificationCopy(){
  def list = [1, 2, 3]
  def newList = []
  list.each{item->
    if(item != 2){
      newList << item
    }
  }
  println newList
}

safeModification()
safeModificationCopy()
```