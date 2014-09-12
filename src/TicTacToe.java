
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oziel
 */
public class TicTacToe {

    private int[][] map;
    private int turn;
    private boolean game;

    //Método de Inicialização do Objeto, inicializa o mapa,
    //o turno (usuário sempre começa), e a flag de fim de jogo
    public TicTacToe() {
        map = new int[3][3];
        turn = 1;
        game = true;
    }

    //Método para jogada de usuário
    public void userPlay(int lin, int col) {
        if (verifyPlay(lin, col)) {
            play(lin, col);
        }
    }

    //Método para jogada da máquina, máquina joga na primeira casa disponível
//    public int machinePlay() {
//        int lin, col;
//        if (game) {
//            if (getMap()[0][0] == 0) {
//                lin = 0;
//                col = 0;
//            } else if (getMap()[0][1] == 0) {
//                lin = 0;
//                col = 1;
//            } else if (getMap()[0][2] == 0) {
//                lin = 0;
//                col = 2;
//            } else if (getMap()[1][0] == 0) {
//                lin = 1;
//                col = 0;
//            } else if (getMap()[1][1] == 0) {
//                lin = 1;
//                col = 1;
//            } else if (getMap()[1][2] == 0) {
//                lin = 1;
//                col = 2;
//            } else if (getMap()[2][0] == 0) {
//                lin = 2;
//                col = 0;
//            } else if (getMap()[2][1] == 0) {
//                lin = 2;
//                col = 1;
//            } else {
//                lin = 2;
//                col = 2;
//            }
//            if (verifyPlay(lin, col)) {
//                play(lin, col);
//                return (lin * 3 + col + 1);
//            } else {
//                return machinePlay();
//
//            }
//        }
//        return 0;
//    }
    public int machinePlay() {
        if (game) {
            boolean p = true;
            int lin = 0, col = 0;
            if (p && map[1][1] == 0) {
                lin = 1;
                col = 1;
                p = false;
            }
            if (p && map[0][0] == 2) {
                if (p && map[0][1] == 2 && map[0][2] == 0) {
                    lin = 0;
                    col = 2;
                    p = false;
                }
                if (p && map[0][2] == 2 && map[0][1] == 0) {
                    lin = 0;
                    col = 1;
                    p = false;
                }
                if (p && map[1][0] == 2 && map[2][0] == 0) {
                    lin = 2;
                    col = 0;
                    p = false;
                }
                if (p && map[2][0] == 2 && map[1][0] == 0) {
                    lin = 1;
                    col = 0;
                    p = false;
                }
                if (p && map[1][1] == 2 && map[2][2] == 0) {
                    lin = 2;
                    col = 2;
                    p = false;
                }
                if (p && map[2][2] == 2 && map[1][1] == 0) {
                    lin = 1;
                    col = 1;
                    p = false;
                }
            }
            if (p && map[0][1] == 2) {
                if (p && map[0][2] == 2 && map[0][0] == 0) {
                    lin = 0;
                    col = 0;
                    p = false;
                }
                if (p && map[1][1] == 2 && map[2][1] == 0) {
                    lin = 2;
                    col = 1;
                    p = false;
                }
                if (p && map[2][2] == 2 && map[1][1] == 0) {
                    lin = 1;
                    col = 1;
                    p = false;
                }
            }
            if (p && map[0][2] == 2) {
                if (p && map[1][2] == 2 && map[2][2] == 0) {
                    lin = 2;
                    col = 2;
                    p = false;
                }
                if (p && map[1][1] == 2 && map[2][0] == 0) {
                    lin = 2;
                    col = 0;
                    p = false;
                }
                if (p && map[2][2] == 2 && map[1][2] == 0) {
                    lin = 1;
                    col = 2;
                    p = false;
                }
                if (p && map[2][0] == 2 && map[1][1] == 0) {
                    lin = 1;
                    col = 1;
                    p = false;
                }
            }
            if (p && map[1][0] == 2) {
                if (p && map[1][1] == 2 && map[1][2] == 0) {
                    lin = 1;
                    col = 2;
                    p = false;
                }
                if (p && map[1][2] == 2 && map[1][1] == 0) {
                    lin = 1;
                    col = 1;
                    p = false;
                }
                if (p && map[2][0] == 2 && map[0][0] == 0) {
                    lin = 0;
                    col = 0;
                    p = false;
                }
            }
            if (p && map[1][1] == 2) {
                if (p && map[1][2] == 2 && map[1][0] == 0) {
                    lin = 1;
                    col = 0;
                    p = false;
                }
                if (p && map[2][0] == 2 && map[0][2] == 0) {
                    lin = 0;
                    col = 2;
                    p = false;
                }
                if (p && map[2][1] == 2 && map[0][1] == 0) {
                    lin = 0;
                    col = 1;
                    p = false;
                }
                if (p && map[2][2] == 2 && map[0][0] == 0) {
                    lin = 0;
                    col = 0;
                    p = false;
                }
            }
            if (p && map[1][2] == 2) {
                if (p && map[2][2] == 2 && map[0][2] == 0) {
                    lin = 0;
                    col = 2;
                    p = false;
                }
            }
            if (p && map[2][0] == 2) {
                if (p && map[2][1] == 2 && map[2][2] == 0) {
                    lin = 2;
                    col = 2;
                    p = false;
                }
                if (p && map[2][2] == 2 && map[2][1] == 0) {
                    lin = 2;
                    col = 1;
                    p = false;
                }
            }
            if (p && map[2][1] == 2) {
                if (p && map[2][2] == 2 && map[2][0] == 0) {
                    lin = 2;
                    col = 0;
                    p = false;
                }
            }
            if (p && map[0][0] == 1) {
                if (p && map[0][1] == 1 && map[0][2] == 0) {
                    lin = 0;
                    col = 2;
                    p = false;
                }
                if (p && map[0][2] == 1 && map[0][1] == 0) {
                    lin = 0;
                    col = 1;
                    p = false;
                }
                if (p && map[1][0] == 1 && map[2][0] == 0) {
                    lin = 2;
                    col = 0;
                    p = false;
                }
                if (p && map[2][0] == 1 && map[1][0] == 0) {
                    lin = 1;
                    col = 0;
                    p = false;
                }
                if (p && map[1][1] == 1 && map[2][2] == 0) {
                    lin = 2;
                    col = 2;
                    p = false;
                }
                if (p && map[2][2] == 1 && map[1][1] == 0) {
                    lin = 1;
                    col = 1;
                    p = false;
                }
            }
            if (p && map[0][1] == 1) {
                if (p && map[0][2] == 1 && map[0][0] == 0) {
                    lin = 0;
                    col = 0;
                    p = false;
                }
                if (p && map[1][1] == 1 && map[2][1] == 0) {
                    lin = 2;
                    col = 1;
                    p = false;
                }
                if (p && map[2][2] == 1 && map[1][1] == 0) {
                    lin = 1;
                    col = 1;
                    p = false;
                }
            }
            if (p && map[0][2] == 1) {
                if (p && map[1][2] == 1 && map[2][2] == 0) {
                    lin = 2;
                    col = 2;
                    p = false;
                }
                if (p && map[1][1] == 1 && map[2][0] == 0) {
                    lin = 2;
                    col = 0;
                    p = false;
                }
                if (p && map[2][2] == 1 && map[1][2] == 0) {
                    lin = 1;
                    col = 2;
                    p = false;
                }
                if (p && map[2][0] == 1 && map[1][1] == 0) {
                    lin = 1;
                    col = 1;
                    p = false;
                }
            }
            if (p && map[1][0] == 1) {
                if (p && map[1][1] == 1 && map[1][2] == 0) {
                    lin = 1;
                    col = 2;
                    p = false;
                }
                if (p && map[1][2] == 1 && map[1][1] == 0) {
                    lin = 1;
                    col = 1;
                    p = false;
                }
                if (p && map[2][0] == 1 && map[0][0] == 0) {
                    lin = 0;
                    col = 0;
                    p = false;
                }
            }
            if (p && map[1][1] == 1) {
                if (p && map[1][2] == 1 && map[1][0] == 0) {
                    lin = 1;
                    col = 0;
                    p = false;
                }
                if (p && map[2][0] == 1 && map[0][2] == 0) {
                    lin = 0;
                    col = 2;
                    p = false;
                }
                if (p && map[2][1] == 1 && map[0][1] == 0) {
                    lin = 0;
                    col = 1;
                    p = false;
                }
                if (p && map[2][2] == 1 && map[0][0] == 0) {
                    lin = 0;
                    col = 0;
                    p = false;
                }
            }
            if (p && map[1][2] == 1) {
                if (p && map[2][2] == 1 && map[0][2] == 0) {
                    lin = 0;
                    col = 2;
                    p = false;
                }
            }
            if (p && map[2][0] == 1) {
                if (p && map[2][1] == 1 && map[2][2] == 0) {
                    lin = 2;
                    col = 2;
                    p = false;
                }
                if (p && map[2][2] == 1 && map[2][1] == 0) {
                    lin = 2;
                    col = 1;
                    p = false;
                }
            }
            if (p && map[2][1] == 1) {
                if (p && map[2][2] == 1 && map[2][0] == 0) {
                    lin = 2;
                    col = 0;
                    p = false;
                }
            }
            if (p && map[1][1] == 2) {
                if (p && map[0][0] == 1 && map[2][2] == 1 && map[0][1] == 0) {
                    lin = 0;
                    col = 1;
                    p = false;
                }
                if (p && map[0][2] == 1 && map[2][0] == 1 && map[0][1] == 0) {
                    lin = 0;
                    col = 1;
                    p = false;
                }
                if (p && map[0][1] == 1 && map[1][0] == 1 && map[0][0] == 0) {
                    lin = 0;
                    col = 0;
                    p = false;
                }
                if (p && map[1][0] == 1 && map[2][1] == 1 && map[2][0] == 0) {
                    lin = 0;
                    col = 0;
                    p = false;
                }
                if (p && map[2][1] == 1 && map[1][2] == 1 && map[2][2] == 0) {
                    lin = 2;
                    col = 2;
                    p = false;
                }
                if (p && map[1][2] == 1 && map[0][1] == 1 && map[0][2] == 0) {
                    lin = 0;
                    col = 2;
                    p = false;
                }
                if (p && map[0][0] == 1) {
                    if (p && map[2][1] == 1 && map[2][0] == 0) {
                        lin = 2;
                        col = 0;
                        p = false;
                    }
                    if (p && map[1][2] == 1 && map[0][2] == 0) {
                        lin = 0;
                        col = 2;
                        p = false;
                    }
                }
                if (p && map[0][2] == 1) {
                    if (p && map[1][0] == 1 && map[0][0] == 0) {
                        lin = 0;
                        col = 0;
                        p = false;
                    }
                    if (p && map[2][1] == 1 && map[2][2] == 0) {
                        lin = 2;
                        col = 2;
                        p = false;
                    }
                }
                if (p && map[2][0] == 1) {
                    if (p && map[1][2] == 1 && map[2][2] == 0) {
                        lin = 2;
                        col = 2;
                        p = false;
                    }
                    if (p && map[0][1] == 1 && map[0][0] == 0) {
                        lin = 0;
                        col = 0;
                        p = false;
                    }
                }
                if (p && map[2][2] == 1) {
                    if (p && map[1][1] == 1 && map[0][2] == 0) {
                        lin = 0;
                        col = 2;
                        p = false;
                    }
                    if (p && map[1][0] == 1 && map[2][0] == 0) {
                        lin = 2;
                        col = 0;
                        p = false;
                    }
                }
            }
            if (p && map[1][1] == 1) {
                if (p && map[0][0] == 0 && map[0][1] == 0 && map[0][2] == 0 && map[1][0] == 0 && map[1][2] == 0 && map[2][0] == 0 && map[2][1] == 0 && map[2][2] == 0) {
                    lin = 0;
                    col = 0;
                    p = false;
                }
                if (p && map[0][0] == 2 && map[2][2] == 1 && map[0][2] == 0) {
                    lin = 0;
                    col = 2;
                    p = false;
                }
            }
            if (p) {
                if (getMap()[0][0] == 0) {
                    lin = 0;
                    col = 0;
                } else if (getMap()[0][1] == 0) {
                    lin = 0;
                    col = 1;
                } else if (getMap()[0][2] == 0) {
                    lin = 0;
                    col = 2;
                } else if (getMap()[1][0] == 0) {
                    lin = 1;
                    col = 0;
                } else if (getMap()[1][1] == 0) {
                    lin = 1;
                    col = 1;
                } else if (getMap()[1][2] == 0) {
                    lin = 1;
                    col = 2;
                } else if (getMap()[2][0] == 0) {
                    lin = 2;
                    col = 0;
                } else if (getMap()[2][1] == 0) {
                    lin = 2;
                    col = 1;
                } else {
                    lin = 2;
                    col = 2;
                }
            }

            if (verifyPlay(lin, col)) {
                play(lin, col);
                return (lin * 3 + col + 1);
            } else {
                return machinePlay();
            }
        } else {
            return 0;
        }

    }
    //Método que aplica no mapa a jogada e muda o turno

    public void play(int lin, int col) {
        getMap()[lin][col] = getTurn();
        if (getTurn() == 1) {
            setTurn(2);
        } else {
            setTurn(1);
        }
    }

    //Método para verificar disponibilidade da jogada
    public boolean verifyPlay(int lin, int col) {
        if (lin > 2 || col > 2 || lin < 0 || col < 0) {
            return false;
        } else {
            if (getMap()[lin][col] != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    //Método para resetar o jogo
    public void clearMap() {
        getMap()[0][0] = 0;
        getMap()[0][1] = 0;
        getMap()[0][2] = 0;
        getMap()[1][0] = 0;
        getMap()[1][1] = 0;
        getMap()[1][2] = 0;
        getMap()[2][0] = 0;
        getMap()[2][1] = 0;
        getMap()[2][2] = 0;
        setTurn(1);
        setGame(true);
    }

    //Método que verifica se houve vencedor ou empate,
    //deve ser chamado após cada jogada
    public void verifyWin() {
        if (getMap()[0][0] == 1 && getMap()[0][1] == 1 && getMap()[0][2] == 1) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória do Usuário");
        } else if (getMap()[1][0] == 1 && getMap()[1][1] == 1 && getMap()[1][2] == 1) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória do Usuário");
        } else if (getMap()[2][0] == 1 && getMap()[2][1] == 1 && getMap()[2][2] == 1) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória do Usuário");
        } else if (getMap()[0][0] == 1 && getMap()[1][0] == 1 && getMap()[2][0] == 1) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória do Usuário");
        } else if (getMap()[0][1] == 1 && getMap()[1][1] == 1 && getMap()[2][1] == 1) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória do Usuário");
        } else if (getMap()[0][2] == 1 && getMap()[1][2] == 1 && getMap()[2][2] == 1) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória do Usuário");
        } else if (getMap()[0][0] == 1 && getMap()[1][1] == 1 && getMap()[2][2] == 1) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória do Usuário");
        } else if (getMap()[0][2] == 1 && getMap()[1][1] == 1 && getMap()[2][0] == 1) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória do Usuário");
        } else if (getMap()[0][0] == 2 && getMap()[0][1] == 2 && getMap()[0][2] == 2) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória da Máquina");
        } else if (getMap()[1][0] == 2 && getMap()[1][1] == 2 && getMap()[1][2] == 2) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória da Máquina");
        } else if (getMap()[2][0] == 2 && getMap()[2][1] == 2 && getMap()[2][2] == 2) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória da Máquina");
        } else if (getMap()[0][0] == 2 && getMap()[1][0] == 2 && getMap()[2][0] == 2) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória da Máquina");
        } else if (getMap()[0][1] == 2 && getMap()[1][1] == 2 && getMap()[2][1] == 2) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória da Máquina");
        } else if (getMap()[0][2] == 2 && getMap()[1][2] == 2 && getMap()[2][2] == 2) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória da Máquina");
        } else if (getMap()[0][0] == 2 && getMap()[1][1] == 2 && getMap()[2][2] == 2) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória da Máquina");
        } else if (getMap()[0][2] == 2 && getMap()[1][1] == 2 && getMap()[2][0] == 2) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Vitória da Máquina");
        } else if (getMap()[0][0] != 0 && getMap()[0][1] != 0 && getMap()[0][2] != 0
                && getMap()[1][0] != 0 && getMap()[1][1] != 0 && getMap()[1][2] != 0
                && getMap()[2][0] != 0 && getMap()[2][1] != 0 && getMap()[2][2] != 0) {
            setGame(false);
            JOptionPane.showMessageDialog(null, "Empate!");
        }
    }

    //Método para imprimir situação atual do mapa no console para verificação
    public void printMap() {
        String out = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (getMap()[i][j] == 2) {
                    out += "X";
                } else if (getMap()[i][j] == 1) {
                    out += "O";
                } else {
                    out += "_";
                }
            }
            out += "\n";
        }
        System.out.println(out);
    }

    /**
     * @return the map
     */
    public int[][] getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(int[][] map) {
        this.map = map;
    }

    /**
     * @return the turn
     */
    public int getTurn() {
        return turn;
    }

    /**
     * @param turn the turn to set
     */
    public void setTurn(int turn) {
        this.turn = turn;
    }

    /**
     * @return the game
     */
    public boolean isGame() {
        return game;
    }

    /**
     * @param game the game to set
     */
    public void setGame(boolean game) {
        this.game = game;
    }
}
