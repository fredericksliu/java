import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class LSAT extends JFrame implements ActionListener {

    JLabel Welcome = new JLabel();
    JTextArea userInputText = new JTextArea("", 10, 10);
    JButton checkQuestionType = new JButton();
    JButton Reset = new JButton();
    JLabel QuestionType = new JLabel();
    JLabel Creator = new JLabel();

    public LSAT(){
        JFrame frame = new JFrame();
        Font font = new Font("AppleGothic", Font.BOLD, 14);

        Welcome.setText("Check your LSAT Logic Reasoning Question Type: ");
        Welcome.setBounds(30,30,400,30);
        Welcome.setFont(font);
        
        Font createrfont = new Font("AppleGothic", Font.ITALIC, 10);
        Creator.setText("Created by Frederick Liu, more features to come...");
        Creator.setBounds(130,450,300,20);
        Creator.setFont(createrfont);

        userInputText.setBounds(100,80,300,200);
        userInputText.setBorder(new TitledBorder(new EtchedBorder(), "Type: "));
        userInputText.setLineWrap(true);
        userInputText.setWrapStyleWord(true);
        userInputText.setToolTipText("Please enter your LSAT Reason and Argument Question");
        userInputText.setFont(font);

        checkQuestionType.setBounds(100,280,120,30);
        checkQuestionType.addActionListener(this);
        checkQuestionType.setText("Check now!");
checkQuestionType.setFont(font);

        QuestionType.setText("Question Type: ");
        QuestionType.setBounds(150,320,300,30);
QuestionType.setFont(font);

        Reset.setText("Reset");
        Reset.setBounds(250,280,120,30);
        Reset.setFont(font);

        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userInputText.setText("");
                checkQuestionType.setText("Check now!");
                QuestionType.setText("Question Type: ");
            }
        });

        frame.add(Creator);
        frame.add(Welcome);
        frame.add(checkQuestionType);
        frame.add(userInputText);
        frame.add(QuestionType);
        frame.add(Reset);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    int i;

    @Override
    public void actionPerformed(ActionEvent e) {
        String UserInputs = userInputText.getText();
        //Array for Key words.
        String[] NecessaryAssump = {"assumption", "depends", "requires", "assumes", "presupposes"};
        String[] SufficientAssump = {"assumption", "allows", "enables", "logically", "inferred"};
        String[] Strengthen = {"strengthen", "strongly", "justifies", "justify", "support"};
        String[] Weaken = {"weaken", "call into question", "counter", "undermine", "doubt", "incomplete"};
        String[] Flaw = {"flaw", "error", "vulnerable", "criticism", "questionable", "fallacious", "unwarranted", "weakness"};
        String[] EvaluateTheArgument = {"evaluating", "evaluate"};
        String[] MethodOfReason = {"method of reasoning", "proceeds", "employs", "strategies", "techniques"};
        String[] Inference = {"must be true", "most strongly supported", "cannot be true", "inferred", "also", "properly", "logically follows"};
        String[] RoleOfStatement = {"roles", "role", "figures", "plays"};
        String[] ParallelReasoning = {"parallel", "similar", "structure", "logical structure", "pattern", "pattern of reasoning"};
        String[] PointAtIssue = {"disagree", "point at issue between", "between", "disagree on", "disagree over"};
        String[] Principle = {"principle", "principles", "propositions", "proposition"};
        String[] ResolveParadox = {"helps to resolve", "resolve", "inconsistency", "reconcile", "discrepancy", "paradox", "apparent", "contradiction", "contributes to an explanation"};
        String[]IdentifyConclusion = {"accurately", "conclusion"};

        //Then check the key Words
        for (i = 0; i < NecessaryAssump.length; i++){
            if (UserInputs.contains(NecessaryAssump[i])) {
                QuestionType.setText("Question Type: Necessary Assumption");
            }
        }

        for (i = 0; i < SufficientAssump.length; i++){
            if (UserInputs.contains(SufficientAssump[i])) {
                QuestionType.setText("Question Type: Sufficient Assumption");
            }
        }

        for (i = 0; i < Strengthen.length; i++){
            if (UserInputs.contains(Strengthen[i])) {
                QuestionType.setText("Question Type: Strengthen");
            }
        }

        for (i = 0; i < Weaken.length; i++){
            if (UserInputs.contains(Weaken[i])) {
                QuestionType.setText("Question Type: Weaken");
            }
        }

        for (i = 0; i < Flaw.length; i++){
            if (UserInputs.contains(Flaw[i])) {
                QuestionType.setText("Question Type: Flaw");
            }
        }


        for (i = 0; i < EvaluateTheArgument.length; i++){
            if (UserInputs.contains(EvaluateTheArgument[i])) {
                QuestionType.setText("Question Type: Evaluate the Argument");
            }
        }


        for (i = 0; i < MethodOfReason.length; i++){
            if (UserInputs.contains(MethodOfReason[i])) {
                QuestionType.setText("Question Type: Method of Reason");
            }
        }

        for (i = 0; i < Inference.length; i++){
            if (UserInputs.contains(Inference[i])) {
                QuestionType.setText("Question Type: Inference");
            }
        }

        for (i = 0; i < RoleOfStatement.length; i++){
            if (UserInputs.contains(RoleOfStatement[i])) {
                QuestionType.setText("Question Type: Role of Statement");
            }
        }

        for (i = 0; i < ParallelReasoning.length; i++){
            if (UserInputs.contains(ParallelReasoning[i])) {
                QuestionType.setText("Question Type: Parallel Reasoning/Flaw");
            }
        }

        for (i = 0; i < PointAtIssue.length; i++){
            if (UserInputs.contains(PointAtIssue[i])) {
                QuestionType.setText("Question Type: Point at Issue");
            }
        }

        for (i = 0; i < Principle.length; i++){
            if (UserInputs.contains(Principle[i])) {
                QuestionType.setText("Question Type: Principle");
            }
        }

        for (i = 0; i < ResolveParadox.length; i++){
            if (UserInputs.contains(ResolveParadox[i])) {
                QuestionType.setText("Question Type: Resolve the Paradox");
            }
        }

        for (i = 0; i < IdentifyConclusion.length; i++){
            if (UserInputs.contains(IdentifyConclusion[i])) {
                QuestionType.setText("Question Type: Identify Conclusion");
            }
        }
    }

    //Output best strategy for each question next...
}
