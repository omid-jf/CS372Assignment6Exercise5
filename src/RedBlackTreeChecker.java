/*
 * This file is part of the CS372Assignment6Exercise5 project.
 *
 * Author: Omid Jafari - omidjafari.com
 * Copyright (c) 2018
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

import java.io.*;

public class RedBlackTreeChecker {

    private static RedBlackTree readTree(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String[] triplets = br.readLine().trim().split(" ");

        RedBlackTree tree = new RedBlackTree();

        for (String triplet : triplets) {
            triplet = triplet.substring(1, triplet.length() - 1);
            String[] values = triplet.split(",");

            Node x = new Node(Integer.parseInt(values[0]), Integer.parseInt(values[1]), values[2].charAt(0));

            if (!tree.insert(x))
                return null;
        }

        return tree;
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("You need to provide the file path as argument!!!");
            System.exit(-1);
        }

        RedBlackTree tree = readTree(args[0]);

        if (tree == null)
            System.out.println("Error in the input file!!!");
        else if (!tree.isBST())
            System.out.println("Not a Red-Black tree, because it is not a BST.");
        else if (!tree.isRootBlack())
            System.out.println("Not a Red-Black tree, because root is not black.");
        else if (tree.isRedRedChild())
            System.out.println("Not a Red-Black tree, because a red node has a red child.");
        else if (!tree.isBlackHeightSame())
            System.out.println("Not a Red-Black tree, because paths from a node to descendant" +
                    " leaves contain different number of black nodes");
        else
            System.out.println("The provided tree is a Red-Black tree.");
    }
}
