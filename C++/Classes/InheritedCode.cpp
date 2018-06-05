class BadLengthException {
private:
    int n;
public:
    explicit BadLengthException(int n) {
        this->n = n;
    };

    int what() {
        return n;
    }
};
