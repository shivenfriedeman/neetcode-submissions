#include <vector>

class DynamicArray {
public:

    DynamicArray(int capacity) {
        cap = capacity;
        size_pointer = 0;
        arr = vector<int>(capacity);
    }

    int get(int i) {
        return arr[i];
    }

    void set(int i, int n) {
        arr[i] = n;
    }

    void pushback(int n) {
        if(size_pointer == cap) {
            resize();
        }
        arr[size_pointer] = n;
        size_pointer ++;
    }

    int popback() {
        int ret = arr[size_pointer - 1];
        size_pointer --;
        return ret;
    }

    void resize() {
        vector<int> new_arr(cap * 2);

        for (int i = 0; i < size_pointer; i ++) {
            new_arr[i] = arr[i];
        }
        arr = new_arr;
        cap *= 2;
    }

    int getSize() {
        return size_pointer;
    }

    int getCapacity() {
        return cap;
    }
private:
    int cap;
    int size_pointer;
    vector<int> arr;
};
