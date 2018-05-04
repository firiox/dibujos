    import java.io.File; // no sirve creo
    import java.io.IOException; // no sirve creo
    import java.awt.image.BufferedImage; // para usar imagenes
    import java.awt.FlowLayout; // para llenar un JFrame
    import javax.imageio.ImageIO; // no sirve creo
    import javax.swing.*; // JFrame
    import java.lang.Math; // sqrt
     
    public class purpleYellow{
      public static void main(String args[])throws IOException{
     
        BufferedImage img = new BufferedImage(550, 550, BufferedImage.TYPE_INT_RGB);
        //esto crea una imagen negra de 500 x 500
     
        int p;
        p = (255<<16) | (255<<8) | 255; // WHITE
        // el color de un pixel en RGB se lo guarda como una mascara de bits
        // usa 25 bits de un entero; los primeros 8 son la cantidad de rojo,
        // los otros 8 de verde y los otros 8 de azul
     
    	// para pintar (encender) un pixel:
    	img.setRGB(200, 200, p); 
    	// pinta el pixel en esas coordenadas de color p
     
        JFrame frame= new JFrame(); // crea el JFrame
     
        frame.setPreferredSize(new java.awt.Dimension(600, 600));
        // lo dimensiona a 500 x 500
        //frame.pack(); // por si acaso para que el JFrame sea de 500 x 500
                      // creo...
     
        frame.getContentPane().setLayout(new FlowLayout());
        // para meter cosas al JFrame
     
        frame.getContentPane().add(new JLabel(new ImageIcon(img)));
        // añades la imagen
     
        frame.setVisible(true);
     
      }
    }