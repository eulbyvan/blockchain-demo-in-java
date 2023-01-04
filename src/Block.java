import java.util.Arrays;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 05/01/2023
 */

public class Block {
    private int previousHash;
    private String[] transactions;
    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        // the block hash is based on the transactions and the previous hash
        Object[] contents = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
