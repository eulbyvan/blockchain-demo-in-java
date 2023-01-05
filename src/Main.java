import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 05/01/2023
 */

public class Main {
    /**
     * Hash = digital signature
     * Each block will have:
            List of transactions
            Previous hash

            Hash
     */

    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) {
        // transactions could be a separate class
        // note that if you change anything inside a block, it will change the hash of all the following blocks

        // genesis block
        String[] genesisTransactions = {"stu sent pid 1 bitcoin", "pid sent 0.5 bitcoin to stu"};
        Block genesisBlock = new Block(0, genesisTransactions);

        // second block
        String[] block2Transactions = {"stu sent pid 0.5 bitcoin", "pid sent 0.1 bitcoin to stu"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        // third block
        String[] block3Transactions = {"stu sent pid 0.1 bitcoin", "pid sent 0.05 bitcoin to stu"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.print("Hash code of the genesis block: ");
        System.out.println(genesisBlock.getBlockHash());

        System.out.print("Hash code of block 2: ");
        System.out.println(block2.getBlockHash());

        System.out.print("Hash code of block 3: ");
        System.out.println(block3.getBlockHash());
    }
}
