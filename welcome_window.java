/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class welcome_window extends javax.swing.JFrame {
        
    static String en,s1,s2,s3,s4,s5;
    boolean[][] visGold=new boolean[6][13];
     static int[][] visGold1=new int[6][13];
    ArrayList<Integer>[] alGold= new ArrayList[5];
    
    /**
     * Creates new form welcome_window
     */
    welcome_window(String s5,String s4,String s3,String s1,String s2,String en) throws IOException {
        int[] x= new int[60];
        System.out.println(s2);
        this.s3=s3;
        this.s4=s4;
        this.s5=s5;
        int k;
        FileReader fr=null; 
        try {
            File file = new File("D:\\"+s2+".txt");
            FileReader fw = new FileReader(file);
            BufferedReader bw = new BufferedReader(fw);
            int z = 0;
            while ((k = bw.read()) != -1) {
                x[z] = k;
                z++;
            }
            int s = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 1; j < 13; j++) {
                    visGold1[i + 1][j] = x[s++];
                }
            }

        } catch (FileNotFoundException bw) {
            System.out.println("File not found");
        } 
        initComponents();
        this.en =en;
        this.s1=s1;
        this.s2=s2;
        this.setLocationRelativeTo(null);
        for (int i = 0; i < 6; i++) {
            visGold[i][0]=false;
        }
        for (int i = 1; i < 13; i++) {
            visGold[0][i]=false;
        }
        for (int i = 0; i < 6; i++) {
            visGold1[i][0]=0;
        }
        for (int i = 1; i < 13; i++) {
            visGold1[0][i]=0;
        }
        for (int i = 0; i < 5; i++) {
            alGold[i]=new ArrayList<Integer>();
        }
          if(visGold1[2][7]==1)
            {
                jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
            }
        if(visGold1[2][8]==1)
            {
                jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
            }
        if(visGold1[2][9]==1)
            {
                jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
            }
        if(visGold1[2][10]==1)
            {
                jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
            }
        if(visGold1[1][12]==1)
            {
                jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
            }
        if (visGold1[1][7] == 1) {
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
        }
        if(visGold1[1][8]==1)
            {
                jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
        if(visGold1[1][9]==1)
            {
                
                jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
        if(visGold1[1][10]==1)
            {
                jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
        if(visGold1[1][11]==1)
            {
                jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
            }
         if(visGold1[2][11]==1)
            {
                jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[2][12]==1)
            {
                jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][7]==1)
            {
                jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][8]==1)
            {
                jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][9]==1)
            {
                jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][10]==1)
            {
                jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][11]==1)
            {
                jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][12]==1)
            {
                jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][7]==1)
            {
                jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][8]==1)
            {
                jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][9]==1)
            {
                jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][10]==1)
            {
                jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][11]==1)
            {
                jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][12]==1)
            {
                jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[5][7]==1)
            {
                jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][8]==1)
            {
                jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][9]==1)
            {
                jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][10]==1)
            {
                jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][11]==1)
            {
                jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][12]==1)
            {
                jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[1][1]==1)
            {
                jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[1][2]==1)
            {
                jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[1][3]==1)
            {
                jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[1][4]==1)
            {
                jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[1][5]==1)
            {
                jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[1][6]==1)
            {
                jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[2][1]==1)
            {
                jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[2][2]==1)
            {
                jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[2][3]==1)
            {
                jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[2][4]==1)
            {
                jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[2][5]==1)
            {
                jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[2][6]==1)
            {
                jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][1]==1)
            {
                jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][2]==1)
            {
                jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][3]==1)
            {
                jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][4]==1)
            {
                jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][5]==1)
            {
                jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[3][6]==1)
            {
                jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][1]==1)
            {
                jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][2]==1)
            {
                jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][3]==1)
            {
                jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][4]==1)
            {
                jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][5]==1)
            {
                jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[4][6]==1)
            {
                jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));

            }
          if(visGold1[5][1]==1)
            {
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][2]==1)
            {
                jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][3]==1)
            {
                jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][4]==1)
            {
                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][5]==1)
            {
                jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
          if(visGold1[5][6]==1)
            {
                jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));

            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_MacOS_Minimize_30px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_MacOS_Close_30px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/download.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/download.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel8.setText(" ");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel34MouseEntered(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel35MouseEntered(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel38MouseEntered(evt);
            }
        });

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
        });

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
        });

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel42MouseEntered(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel45MouseEntered(evt);
            }
        });

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel46MouseEntered(evt);
            }
        });

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png"))); // NOI18N
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("A");

        jLabel17.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 51));
        jLabel17.setText("B");

        jLabel69.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(204, 0, 51));
        jLabel69.setText("C");

        jLabel70.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(204, 0, 51));
        jLabel70.setText("D");

        jLabel71.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("E");

        jLabel72.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("1");

        jLabel73.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("6");

        jLabel74.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("7");

        jLabel75.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("8");

        jLabel76.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("9");

        jLabel77.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("10");

        jLabel78.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("11");

        jLabel79.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("12");

        jLabel82.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("4");

        jLabel83.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("3");

        jLabel84.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("5");

        jLabel85.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("2");

        jLabel89.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("P L A T I N U M  S E A T S (300 RS.)");
        jLabel89.setToolTipText("");

        jLabel92.setFont(new java.awt.Font("Segoe UI Semilight", 1, 28)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText(" B O O K  N O W");
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_login_rounded_50px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_home_50px.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_MacOS_Minimize_30px.png"))); // NOI18N
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
        });

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_MacOS_Close_30px.png"))); // NOI18N
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(73, 73, 73)
                .addComponent(jLabel20)
                .addGap(92, 92, 92)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel81)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel20)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel81)
                            .addComponent(jLabel80))))
                .addContainerGap())
        );

        jLabel93.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 102, 0));
        jLabel93.setText("A L L  E Y E S  T H I S  W A Y  P L E A S E");

        jLabel94.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("G O L D  S E A T S (150 RS.)");
        jLabel94.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel89))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel94)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(238, 238, 238)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel60)
                                            .addComponent(jLabel52)
                                            .addComponent(jLabel25)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel67)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel63)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel59))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel51)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel64)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel65))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel22)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel23)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel24))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel66)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel62)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel61)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel54)
                                                .addGap(9, 9, 9))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10)))
                                        .addGap(1, 1, 1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel72)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel85)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel83)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel82)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addGap(0, 106, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel56)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel58))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel55)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel53))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel21))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel57)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel68)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel17))
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel84)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel73))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel42)
                            .addComponent(jLabel44)
                            .addComponent(jLabel33))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel41)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel38)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel34)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel46)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel40)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel36)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel35)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel47)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel49)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel39)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel37)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel43)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel48)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel50)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32)))
                        .addGap(0, 383, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel74)
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel75)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel76)
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel77)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel78)
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel79))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel18)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel92)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addGap(73, 73, 73)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(196, 196, 196))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel93))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel38)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel53)
                                        .addComponent(jLabel51)
                                        .addComponent(jLabel52)
                                        .addComponent(jLabel64)
                                        .addComponent(jLabel65)
                                        .addComponent(jLabel55))
                                    .addGap(4, 4, 4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel17)
                                    .addGap(1, 1, 1)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel49)))
                                .addComponent(jLabel36)
                                .addComponent(jLabel40)
                                .addComponent(jLabel42))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel62)
                                            .addComponent(jLabel66)
                                            .addComponent(jLabel61)
                                            .addComponent(jLabel60)
                                            .addComponent(jLabel56)
                                            .addComponent(jLabel58)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel69)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel94)
                                .addGap(39, 39, 39)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel33)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel67)
                            .addComponent(jLabel63)
                            .addComponent(jLabel59)
                            .addComponent(jLabel54)
                            .addComponent(jLabel57)
                            .addComponent(jLabel68)
                            .addComponent(jLabel70))))
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel71))
                            .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel79)
                                .addComponent(jLabel78)
                                .addComponent(jLabel77))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel76)
                                .addComponent(jLabel75))
                            .addComponent(jLabel74)
                            .addComponent(jLabel73)
                            .addComponent(jLabel72)
                            .addComponent(jLabel84)
                            .addComponent(jLabel85)
                            .addComponent(jLabel82)
                            .addComponent(jLabel83)))
                    .addComponent(jLabel18))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        if (visGold1[1][7] == 1) {
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
             JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");
        } else {
            if (visGold[1][7] != true) {

                jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                visGold[1][7] = true;

            } else {
                jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                visGold[1][7] = false;

            }
        }
 
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
              // jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
 if(visGold1[1][8]==1)
            {
                jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                             JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
 {
      if(visGold[1][8] !=true)
       {
                 jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][8]=true;
  
       }
       else
       {
                   jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][8]=false;

       }
 }
             
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
  if(visGold1[1][9]==1)
            {
                
                jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
 {
      if(visGold[1][9] !=true)
       {
                 jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][9]=true;
  
       }
       else
       {
                   jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][9]=false;

       }
 }
 
       
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
  if(visGold1[1][10]==1)
            {
                jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
 {
  if(visGold[1][10] !=true)
       {
                 jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][10]=true;
  
       }
       else
       {
                   jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][10]=false;

       }
 }
       
    
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
    if(visGold1[1][11]==1)
            {
                jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
 {
     if(visGold[1][11] !=true)
       {
                 jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][11]=true;
  
       }
       else
       {
                   jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][11]=false;

       }
 }
        
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
    if(visGold1[1][12]==1)
            {
                jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
 {
     if(visGold[1][12] !=true)
       {
                 jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][12]=true;
  
       }
       else
       {
                   jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][12]=false;

       }
 }
        
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
   if(visGold1[2][7]==1)
            {
                jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
 {
     if(visGold[2][7] !=true)
       {
                 jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][7]=true;
  
       }
       else
       {
                   jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][7]=false;

       }
 }
        
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
    if(visGold1[2][8]==1)
            {
                jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
 {
      if(visGold[2][8] !=true)
       {
                 jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][8]=true;
  
       }
       else
       {
                   jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][8]=false;

       }
 }
       
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
    if(visGold1[2][9]==1)
            {
                jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
 {
  if(visGold[2][9] !=true)
       {
                 jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][9]=true;
  
       }
       else
       {
                   jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][9]=false;

       }   
 }
        
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
     if(visGold1[2][10]==1)
            {
                jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
 {
     if(visGold[2][10] !=true) 
       {
                 jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][10]=true;
  
       }
       else
       {
                   jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][10]=false;

       }
 }
        
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
    if(visGold1[2][11]==1)
            {
                jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
     if(visGold[2][11] !=true)
       {
                 jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][11]=true;
  
       }
       else
       {
                   jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][11]=false;

       }   
    }
        
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
  if(visGold1[2][12]==1)
            {
                jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[2][12] !=true)
       {
                 jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][12]=true;
  
       }
       else
       {
                   jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][12]=false;

       }
    }
        
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
    if(visGold1[3][7]==1)
            {
                jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[3][7] !=true)
       {
                 jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][7]=true;
  
       }
       else
       {
                   jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][7]=false;

       }
    }
        
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
       if(visGold1[3][8]==1)
            {
                jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[3][8] !=true)
       {
                 jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][8]=true;
  
       }
       else
       {
                   jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][8]=false;

       }
    }
        
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        if(visGold1[3][9]==1)
            {
                jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[3][9] !=true)
       {
                 jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][9]=true;
  
       }
       else
       {
                   jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][9]=false;

       }
    }   
       
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        if(visGold1[3][10]==1)
            {
                jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[3][10] !=true)
       {
                 jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][10]=true;
  
       }
       else
       {
                   jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][10]=false;

       }
    }        
        
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        if(visGold1[3][11]==1)
            {
                jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[3][11] !=true)
       {
                 jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][11]=true;
  
       }
       else
       {
                   jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][11]=false;

       }
    }        
       
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        if(visGold1[3][12]==1)
            {
                jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[3][12] !=true)
       {
                 jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][12]=true;
  
       }
       else
       {
                   jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][12]=false;

       }
    }    
        
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        if(visGold1[4][7]==1)
            {
                jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[4][7] !=true)
       {
                 jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][7]=true;
  
       }
       else
       {
                   jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][7]=false;

       }
    }        
       
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        if(visGold1[4][8]==1)
            {
                jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[4][8] !=true)
       {
                 jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][8]=true;
  
       }
       else
       {
                   jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][8]=false;

       }
    }       
       
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        if(visGold1[4][9]==1)
            {
                jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[4][9] !=true)
       {
                 jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][9]=true;
  
       }
       else
       {
                   jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][9]=false;

       }
    }          
       
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
         if(visGold1[4][10]==1)
            {
                jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[4][10] !=true)
       {
                 jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][10]=true;
  
       }
       else
       {
                   jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][10]=false;

       }
    }       
       
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        if(visGold1[4][11]==1)
            {
                jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
       if(visGold[4][11] !=true)
       {
                 jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][11]=true;
  
       }
       else
       {
                   jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][11]=false;

       } 
    }           
        
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        if(visGold1[4][12]==1)
            {
                jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[4][12] !=true)
       {
                 jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][12]=true;
  
       }
       else
       {
                   jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][12]=false;

       }
    }             
        
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(visGold1[5][7]==1)
            {
                jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[5][7] !=true)
       {
                 jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][7]=true;
  
       }
       else
       {
                   jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][7]=false;
       }
    }   
       
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
         if(visGold1[5][8]==1)
            {
                jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[5][8] !=true)
       {
                 jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][8]=true;
  
       }
       else
       {
                   jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][8]=false;
       }
    }     
       
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if(visGold1[5][9]==1)
            {
                jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[5][9] !=true)
       {
                 jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][9]=true;
  
       }
       else
       {
                   jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][9]=false;
       }
    }      
       
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if(visGold1[5][10]==1)
            {
                jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
       if(visGold[5][10] !=true)
       {
                 jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][10]=true;
  
       }
       else
       {
                   jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][10]=false;
       } 
    }    
        
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        if(visGold1[5][11]==1)
            {
                jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[5][11] !=true)
       {
                 jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][11]=true;
  
       }
       else
       {
                   jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][11]=false;
       }
    }     
        
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
         if(visGold1[5][12]==1)
            {
                jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[5][12] !=true)
       {
                 jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][12]=true;
  
       }
       else
       {
                   jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][12]=false;
       }
    }    
       
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
     if(visGold1[1][1]==1)
            {
                jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[1][1] !=true)
       {
                 jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][1]=true;
  
       }
       else
       {
                   jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][1]=false;

       }
    }
       
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        if(visGold1[1][2]==1)
            {
                jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
       if(visGold[1][2] !=true)
       {
                 jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][2]=true;
  
       }
       else
       {
                   jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][2]=false;

       } 
    }  
        
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        if(visGold1[1][3]==1)
            {
                jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[1][3] !=true)
       {
                 jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][3]=true;
  
       }
       else
       {
                   jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][3]=false;

       }
    }     
        
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        if(visGold1[1][4]==1)
            {
                jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[1][4] !=true)
       {
                 jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][4]=true;
  
       }
       else
       {
                   jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][4]=false;

       }
    }
        
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        if(visGold1[1][5]==1)
            {
                jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[1][5] !=true)
       {
                 jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][5]=true;
  
       }
       else
       {
                   jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][5]=false;

       }
    }   
        
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        if(visGold1[1][6]==1)
            {
                jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[1][6] !=true)
       {
                 jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[1][6]=true;
  
       }
       else
       {
                   jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[1][6]=false;

       }
    }     
       
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
         if(visGold1[2][1]==1)
            {
                jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[2][1] !=true)
       {
                 jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][1]=true;
  
       }
       else
       {
                   jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][1]=false;

       }
    }   
        
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        if(visGold1[2][2]==1)
            {
                jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[2][2] !=true)
       {
                 jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][2]=true;
  
       }
       else
       {
                   jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][2]=false;

       }
    }
        
        
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
         if(visGold1[2][3]==1)
         
         {
                jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    { 
         if(visGold[2][3] !=true)
       {
                 jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][3]=true;
  
       }
       else
       {
                   jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][3]=false;

       }
    }         
       
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
         if(visGold1[2][4]==1)
         
         {
                jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    { 
         if(visGold[2][4] !=true)
       {
                 jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][4]=true;
  
       }
       else
       {
                   jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][4]=false;

       }
    }          
       
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
             if(visGold1[2][5]==1)
         
         {
                jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    { 
        if(visGold[2][5] !=true)
       {
                 jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][5]=true;
  
       }
       else
       {
                   jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][5]=false;

       }
    }      
        
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
         if(visGold1[2][6]==1)
         
         {
                jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    { 
         if(visGold[2][6] !=true)
       {
                 jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[2][6]=true;
  
       }
       else
       {
                   jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[2][6]=false;

       }
    }               
       
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
         if(visGold1[3][1]==1)
         
         {
                jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    { 
         if(visGold[3][1] !=true)
       {
                 jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][1]=true;
  
       }
       else
       {
                   jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][1]=false;

       }
    }
        
       
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        if(visGold1[3][2]==1)
         
         {
                jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    { 
       if(visGold[3][2] !=true)
       {
                 jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][2]=true;
  
       }
       else
       {
                   jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][2]=false;
       } 
    }
        
        
    }//GEN-LAST:event_jLabel62MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        if(visGold1[3][3]==1)
         
         {
                jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
        if(visGold[3][3] !=true)
       {
                 jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][3]=true;
  
       }
       else
       {
                   jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][3]=false;
       }
    }   
        
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
         if(visGold1[3][4]==1)
         
         {
                jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
        if(visGold[3][4] !=true)
       {
                 jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][4]=true;
  
       }
       else
       {
                   jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][4]=false;
       }
    }
        
        
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
         if(visGold1[3][5]==1)
         
         {
                jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
         if(visGold[3][5] !=true)
       {
                 jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][5]=true;
  
       }
       else
       {
                   jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][5]=false;
       }
    }     
       
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        if(visGold1[3][6]==1)
         
         {
                jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
         if(visGold[3][6] !=true)
       {
                 jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[3][6]=true;
  
       }
       else
       {
                   jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[3][6]=false;
       }
    }      
       
    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
        if(visGold1[4][1]==1)
         
         {
                jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
         if(visGold[4][1] !=true)
       {
                 jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][1]=true;
  
       }
       else
       {
                   jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][1]=false;
       }
    }  
       
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
         if(visGold1[4][2]==1)
         
         {
                jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
        if(visGold[4][2] !=true)
       {
                 jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][2]=true;
  
       }
       else
       {
                   jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][2]=false;
       }
    }    
        
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        if(visGold1[4][3]==1)
         
         {
                jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
        if(visGold[4][3] !=true)
       {
                 jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][3]=true;
  
       }
       else
       {
                   jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][3]=false;
       }
    }     
        
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
         if(visGold1[4][4]==1)
         
         {
                jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
       if(visGold[4][4] !=true)
       {
                 jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][4]=true;
  
       }
       else
       {
                   jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][4]=false;
       } 
    }    
        
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
         if(visGold1[4][5]==1)
         
         {
                jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
        if(visGold[4][5] !=true)
       {
                 jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][5]=true;
  
       }
       else
       {
                   jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][5]=false;
       }
    }   
        
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
         if(visGold1[4][6]==1)
         
         {
                jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_living_room_24px_1.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
         if(visGold[4][6] !=true)
       {
                 jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_3.png")));
                 visGold[4][6]=true;
  
       }
       else
       {
                   jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_24px_2.png")));
                   visGold[4][6]=false;
       }
    }   
       
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(visGold1[5][1]==1)
         
         {
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
         if(visGold[5][1] !=true)
       {
                 jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][1]=true;
  
       }
       else
       {
                   jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][1]=false;
       }
    }      
       
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(visGold1[5][2]==1)
         
         {
                jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   
        if(visGold[5][2] !=true)
       {
                 jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][2]=true;
  
       }
       else
       {
                   jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][2]=false;
       }
    }    
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
         if(visGold1[5][3]==1)
         
         {
                jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {   if(visGold[5][3] !=true)
       {
                 jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][3]=true;
  
       }
       else
       {
                   jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][3]=false;
       }
        
    }    
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
         if(visGold1[5][4]==1)
         
         {
                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    { if(visGold[5][4] !=true)
       {
                 jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][4]=true;
  
       }
       else
       {
                   jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][4]=false;
       }
        
    }    
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(visGold1[5][5]==1)
         
         {
                jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
        if(visGold[5][5] !=true)
       {
                 jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][5]=true;
  
       }
       else
       {
                   jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][5]=false;
       }
    }    
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(visGold1[5][6]==1)
         
         {
                jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_2.png")));
                                JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY OCCUPIED !");

            }
       else
    {
         if(visGold[5][6] !=true)
       {
                 jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px_1.png")));
                 visGold[5][6]=true;
  
       }
       else
       {
                   jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa_project/icons8_armchair_40px.png")));
                   visGold[5][6]=false;
       }
    }      
       
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
         
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
         
    }//GEN-LAST:event_jLabel41MouseEntered

    private void jLabel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseEntered
       
    }//GEN-LAST:event_jLabel38MouseEntered

    private void jLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseEntered
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jLabel34MouseEntered

    private void jLabel46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseEntered
         
    }//GEN-LAST:event_jLabel46MouseEntered

    private void jLabel45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseEntered
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel45MouseEntered

    private void jLabel42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseEntered
       
    }//GEN-LAST:event_jLabel42MouseEntered

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
      
    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
       
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseEntered
         
    }//GEN-LAST:event_jLabel35MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        LOGIN1 spp = new LOGIN1();
        spp.setVisible(true);
        spp.pack();
        spp.setLocationRelativeTo(null);
        spp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Homepage2 spp = new Homepage2(en);
        spp.setVisible(true);
        spp.pack();
        spp.setLocationRelativeTo(null);
        spp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
 int[] x= new int[60];
     int counter =0;
        int k;
        FileReader fr=null;
        
        ArrayList <String> Present_seat = new ArrayList();
        try
        { 
            File file = new File("D:\\"+s2+".txt");
            
            FileReader fw=new FileReader(file);
            BufferedReader bw = new BufferedReader(fw);
            int z=0;
            while ((k=bw.read()) != -1)
                        {
                           x[z]=k;
                           z++;    
                        }
            int s=0;
                for (int i = 0; i < 5; i++) {
                    for (int j = 1; j < 13; j++) {

                        visGold1[i + 1][j] = x[s++];
                         //System.out.println(visGold1[i + 1][j]);

                    }
                }
            
        
        } 
        catch (FileNotFoundException bw) 
        { 
            System.out.println("File not found"); 
        } catch (IOException ex) { 
            Logger.getLogger(welcome_window.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < 5; i++) {
           char c = (char) (i+65);
            for (int j = 1; j <=12; j++) {
                if(visGold[i+1][j]==true)
                {
                    alGold[i].add(j);
                    visGold1[i+1][j]=1;
                    
                    Present_seat.add(Character.toString(c) + j);
                    counter++;
                }
                
                
            }
            
        }
        try { 
            File file = new File("D:\\"+s2+".txt");
            FileWriter fw=new FileWriter(file);
            if (!file.exists()) {
                file.createNewFile();
            } else {

            }
            BufferedWriter bw = new BufferedWriter(fw);
             for (int i = 0; i < 5; i++) {
                 for (int j = 1; j <=12; j++) {
                      bw.write(visGold1[i+1][j]);
                 }
            }
  
       //System.out.println("Writing successful"); 
        //close the file  
        bw.close(); 
        } catch (IOException ex) {
            Logger.getLogger(welcome_window.class.getName()).log(Level.SEVERE, null, ex);
        }
//        for (int i = 0; i < 12; i++) {
//            if(visPre[i+1]==true)
//            {
//                pre.add(i+1);
//            }
//        }

    String Seats = String.join(", ", Present_seat);

              JOptionPane.showMessageDialog(null,"Your Seats are "+Seats);
               Ticket spp = new Ticket(s5 ,s4,s3,s1,s2,Seats,counter,en);
       spp.setVisible(true);
       spp.pack();
       spp.setLocationRelativeTo(null);
       spp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel92MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        
    
        
      
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcome_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new welcome_window(s5,s4,s3,s1,s2,en).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(welcome_window.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
