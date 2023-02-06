/**
 * @(#)Blobs.java
 *
 *
 * @author 
 * @version 1.00 2006/10/25
 */

/*
   This applet demonstrates recursion by counting the number of
   squares in a "blob".  The squares are arranged in a grid,
   and each position in the grid can be either empty or filled.
   A blob is defined to be a filled square and any square that
   can be reached from that square by moving horizontally or
   vertically to other filled squares.  This applet fills
   the grid randomly.  If the user clicks on a filled square,
   all the squares in the blob that contains that square are
   colored red, and the number of squares in the blob is
   reported.  The applet can also count and report the number
   of blobs.  When the user clicks a "New Blobs" button,
   the grid is randomly re-filled.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Blobs extends JApplet implements ActionListener, MouseListener {
 
   final static int SQUARE_SIZE = 8;  // Size of one square in the grid.

   JLabel message;       // For displaying information to the user.
   
   JComboBox percentFill;  // When the user clicks the "New Blobs" button
                           // to randomly fill the grid, this menu controlls
                           // the probability that a given square in the grid
                           // is filled.
   
   int rows;     // Number of rows in the grid.  This depend on the size of the applet.
   int columns;  // Number of columns in the grid.  This depend on the size of the applet.
   
   boolean[][] filled;  // filled[r][c] is true if the square at row r, column c is filled.
   
   boolean[][] visited; // visited[r][c] is true if the square at row r, column c has
                        //   has already been visited by the getBlobSize() method.
   

   public void init() {
         // Initialize the applet.  Install a new content pane.
         // Use a null layout and set the bounds of the components
         // in the applet directly.  The applet listens
         // for mouse clicks on the content pane.
   
      Content content;  // Content pane, defined by nested class Content
      content = new Content();
      setContentPane(content);
      
      content.setLayout(null);
      content.setBackground(new Color(220,220,255));
      content.addMouseListener(this);
      content.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.blue));
      
      /* Determine the number of rows and columns and create the
         filled and visited arrays.  Fill the squares at random. */
      
      int width = getSize().width;
      int height = getSize().height;

      rows = (height - 100) / SQUARE_SIZE;
      columns = (width - 20) / SQUARE_SIZE;
      
      filled = new boolean[rows][columns];
      visited = new boolean[rows][columns];
      
      for (int r = 0; r < rows; r++)
         for (int c = 0; c < columns; c++)
            filled[r][c] = (Math.random() < 0.3);
            
      /* Create the components. */
      
      message = new JLabel("Click a square to get the blob size.", JLabel.CENTER);
      message.setForeground(Color.blue);
      message.setFont(new Font("Helvetica",Font.PLAIN,14));
      
      percentFill = new JComboBox();
      percentFill.addItem("10% fill");
      percentFill.addItem("20% fill");
      percentFill.addItem("30% fill");
      percentFill.addItem("40% fill");
      percentFill.addItem("50% fill");
      percentFill.addItem("60% fill");
      percentFill.addItem("70% fill");
      percentFill.addItem("80% fill");
      percentFill.addItem("90% fill");
      percentFill.setBackground(Color.white);
      percentFill.setSelectedIndex(2);
      
      JButton newButton = new JButton("New Blobs");
      newButton.addActionListener(this);
      newButton.setBackground(Color.lightGray);
      
      JButton countButton = new JButton("Count the Blobs");
      countButton.addActionListener(this);
      countButton.setBackground(Color.lightGray);
      
      /* Add the components to the applet and set their sizes and positions. */
            
      content.add(message);
      content.add(newButton);
      content.add(percentFill);
      content.add(countButton);
      
      message.setBounds(15, height-75, width-30, 18);
      countButton.setBounds(15, height-50, width-30, 18);
      newButton.setBounds(15, height-25, (width-40)/2, 18);
      percentFill.setBounds(width/2 + 5, height-25, (width-40)/2, 18);
      
   } // end init();
   
   
   public void actionPerformed(ActionEvent evt) {
         // When the user clicks a button, call the appropriate method.
      String cmd = evt.getActionCommand();
      if (cmd.equals("New Blobs"))
         fillGrid();
      else if (cmd.equals("Count the Blobs"))
         countBlobs();
   }
   
   
   void fillGrid() {
         // When the user clicks the "New Blobs" button, fill the grid of squares
         // randomly.  The probability that a given square is filled is given by
         // the percentFill Choice menu.  The probabilities corresponding to the
         // items in that menu are 0.1, 0.2,... 0.9.  The visited array is cleared
         // so there won't be any red-colored squares in the grid.
      double probability = (percentFill.getSelectedIndex() + 1) / 10.0;
      for (int r = 0; r < rows; r++)
         for (int c = 0; c < columns; c++) {
            filled[r][c] = (Math.random() < probability);
            visited[r][c] = false;
         }
      message.setText("Click a square to get the blob size.");
      repaint();
   }


   void countBlobs() {
         // When the use clicks the "Count the Blobs" button, find the number
         // of blobs in the grid and report the number in the message Label.
         
      int count = 0; // Number of blobs.
      
      /* First clear out the visited array. The getBlobSize() method will
         mark every filled square that it finds by setting the corresponding
         element of the array to true.  Once a square has been marked as
         visited, it will stay marked until all the blobs have been counted.
         This will prevent the same blob from being counted more than once. */
      
      for (int r = 0; r < rows; r++)
         for (int c = 0; c < columns; c++)
            visited[r][c] = false;
            
      /* For each position in the grid, call getBlobSize() to get the size
         of the blob at that position.  If the sixe is not zero, count a blob.
         Note that if we come to a position that was part of a previously
         counted square, getBlobSize() will return 0 and the blob will not
         be counted again. */
            
      for (int r = 0; r < rows; r++)
         for (int c = 0; c < columns; c++) {
            if (getBlobSize(r,c) > 0)
               count++;
         }
                     
      repaint();  // Note that all the filled squares will be red!
      
      message.setText("The number of blobs is " + count);
            
   } // end countBlobs()
   

   int getBlobSize(int r, int c) {
         // Counts the squares in the blob at position (r,c) in the
         // grid.  Squares are only counted if they are filled and
         // unvisited.  If this routine is called for a position that
         // has been visited, the return value will be zero.
      if (r < 0 || r >= rows || c < 0 || c >= columns) {
            // This position is not in the grid, so there is
            // no blob at this position.
         return 0;
      }
      if (filled[r][c] == false || visited[r][c] == true) {
           // This square is not part of a blob, or else it has
           // already been counted, so return zero.
         return 0;
      }
      visited[r][c] = true;   // Mark the square as visited so that
                              //    we won't count it again during the
                              //    following recursive calls to this method.
      int size = 1;  // Count the square at this position, then count the
                     //   the blobs that are connected to this square
                     //    horizontally or vertically.
      size += getBlobSize(r-1,c);
      size += getBlobSize(r+1,c);
      size += getBlobSize(r,c-1);
      size += getBlobSize(r,c+1);
      return size;
   }  // end getBlobSize()
   
   
   public void mousePressed(MouseEvent evt) {
          // The user has clicked the mouse on the applet.  If the
          // user has clicked on a position in the grid, count
          // the number of squares in the blob at that position.
      int row = (evt.getY() - 10) / SQUARE_SIZE;
      int col = (evt.getX() - 10) / SQUARE_SIZE;
      if (row < 0 || row >= rows || col < 0 || col >= columns) {
         message.setText("Please click on a square!");
         return;
      }
      for (int r = 0; r < rows; r++)
         for (int c = 0; c < columns; c++)
            visited[r][c] = false;  // Clear visited array before counting.
      int size = getBlobSize(row,col);
      if (size == 0)
         message.setText("There is no blob at (" + row + "," + col + ").");
      else if (size == 1)
         message.setText("Blob at (" + row + "," + col + ") contains 1 square.");
      else
         message.setText("Blob at (" + row + "," + col + ") contains " + size + " squares.");
      repaint();
   }
   
   
   public void mouseReleased(MouseEvent e) { }  // Methods required by MouseListener interface
   public void mouseClicked(MouseEvent e) { }
   public void mouseEntered(MouseEvent e) { }
   public void mouseExited(MouseEvent e) { }
   

   class Content extends JPanel {
          // Nested class only provided painting of the applet's content pane.
      
      public void paintComponent(Graphics g) {
            // Paint the applet, showing the grid of squares.

         super.paintComponent(g);  // Fill with background color.

         int width = getSize().width;
         int height = getSize().height;

         /* Fill the area occupied by the grid with white, then draw
            black lines around this area and between the squares of
            the grid. */

         g.setColor(Color.white);
         g.fillRect(10, 10, columns*SQUARE_SIZE, rows*SQUARE_SIZE);

         g.setColor(Color.black);
         for (int i = 0; i <= rows; i++)
            g.drawLine(10, 10 + i*SQUARE_SIZE, columns*SQUARE_SIZE + 10, 10 + i*SQUARE_SIZE);
         for (int i = 0; i <= columns; i++)
            g.drawLine(10 + i*SQUARE_SIZE, 10, 10 + i*SQUARE_SIZE, rows*SQUARE_SIZE + 10);

         /* Fill "visited" squares with red and "filled" squares with gray.
            Other squares remain white.  */

         for (int r = 0; r < rows; r++)
            for (int c = 0; c < columns; c++) {
               if (visited[r][c]) {
                  g.setColor(Color.red);
                  g.fillRect(11 + c*SQUARE_SIZE, 11 + r*SQUARE_SIZE, SQUARE_SIZE - 1, SQUARE_SIZE - 1);
               }
               else if (filled[r][c]) {
                  g.setColor(Color.gray);
                  g.fillRect(11 + c*SQUARE_SIZE, 11 + r*SQUARE_SIZE, SQUARE_SIZE - 1, SQUARE_SIZE - 1);
               }
            }

      } // end paintComponent();
   
   } // End nested class Content
   
   
} // end class Blobs

