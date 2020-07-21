package thuc_hanh_search_cay_nhi_phan_optional;

public class Test {
    public static void main(String[] args) {
        BST<String> stringBST = new BST<>();
        stringBST.insert("George");
        stringBST.insert("Michael");
        stringBST.insert("Tom");
        stringBST.insert("Adam");
        stringBST.insert("Jones");
        stringBST.insert("Peter");
        stringBST.insert("Daniel");

        System.out.println("InOrder (sorted) :");
        stringBST.inorder();
        System.out.println("PreOrder (sorted) :");
        stringBST.preOrder();
        System.out.println("PostOrder (sorted) :");
        stringBST.postOrder();
        System.out.println("The number of nodes is :" + stringBST.getSize());

        System.out.println("---isExits---");
        System.out.println(stringBST.isExits("Peter"));
        System.out.println("---delete---");
        System.out.println(stringBST.delete("Adam"));
        stringBST.inorder();
    }
}
