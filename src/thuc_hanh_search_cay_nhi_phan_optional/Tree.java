package thuc_hanh_search_cay_nhi_phan_optional;

public interface Tree<E> {

    boolean insert(E e);

    void inorder();

    int getSize();

    void postOrder();

    void preOrder();

    boolean delete(E e);

    boolean isExits(E e);
}
