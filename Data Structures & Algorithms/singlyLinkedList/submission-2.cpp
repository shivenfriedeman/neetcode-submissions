class LinkedList {
private:
    struct ListNode { 
        int data;
        ListNode* next;

        explicit ListNode(int data, ListNode* next = nullptr) 
            : data(data), next(next) {}
    };

    struct ListNode* head;
    int size;

    int get_help(int n, struct ListNode* curr) {
        if (n == 0) {
            return curr->data;
        }
        return get_help(n - 1, curr->next);
    }

    void insertTail_help(int val, struct ListNode* curr) {
        if (curr->next == nullptr) {
            curr->next = new ListNode(val);
        } else {
            insertTail_help(val, curr->next);
        }
    }
    
    void remove_help(int n, struct ListNode* curr) {
        if (n == 1) {
            curr->next = curr->next->next;
        } else {
            remove_help(n - 1, curr->next);
        }
    }

public:
    LinkedList() {
        head = nullptr;
        size = 0;
    }

    int get(int i) {
        if (i < 0 || i >= size) {
            return -1;
        }
        return get_help(i, head);
    }

    void insertHead(int val) {
        head = new ListNode(val, head);
        size ++;
    }
    
    void insertTail(int val) {
        if (head == nullptr) {
            head  = new ListNode(val);
        } else {
            insertTail_help(val, head);
        }
        size ++;
    }

    bool remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        if (index == 0) {
            head = head->next; // potential failed delete
        } else {
            remove_help(index, head);
        }
        size --;
        return true;

    }

    vector<int> getValues() {
        vector<int> ret(size);
        ListNode* curr = head;
        for (int i = 0; i < size; i ++) {
            ret[i] = curr->data;
            curr = curr->next;
        } 
        return ret;
    }
};
