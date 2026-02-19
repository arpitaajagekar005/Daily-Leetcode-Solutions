class Node:
    def __init__(self, val=None, next=None):
        self.val = val
        self.next = next


class MyLinkedList:

    def __init__(self):
        self.head = None
        self.size = 0

    def get(self, index: int) -> int:
        if index < 0 or index >= self.size:
            return -1

        count = 0
        cur = self.head
        while cur:
            if count == index:
                return cur.val
            count += 1
            cur = cur.next

    def addAtHead(self, val: int) -> None:
        node = Node(val, self.head)
        self.head = node
        self.size += 1

    def addAtTail(self, val: int) -> None:
        if self.head is None:
            self.head = Node(val)
            self.size += 1
            return

        cur = self.head
        while cur.next:
            cur = cur.next
        cur.next = Node(val)
        self.size += 1

    def addAtIndex(self, index: int, val: int) -> None:
        if index < 0 or index > self.size:
            return

        if index == 0:
            self.addAtHead(val)
            return

        count = 0
        cur = self.head
        while cur:
            if count == index - 1:
                node = Node(val, cur.next)
                cur.next = node
                self.size += 1
                return
            count += 1
            cur = cur.next

    def deleteAtIndex(self, index: int) -> None:
        if index < 0 or index >= self.size:
            return

        if index == 0:
            self.head = self.head.next
            self.size -= 1
            return

        count = 0
        cur = self.head
        while cur:
            if count == index - 1:
                cur.next = cur.next.next
                self.size -= 1
                return
            count += 1
            cur = cur.next

        


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)