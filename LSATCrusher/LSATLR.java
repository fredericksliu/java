
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class LSATLR extends JFrame implements ActionListener, MouseListener{

    JLabel Welcome = new JLabel();
    JTextArea userInputText = new JTextArea("", 10, 10);
    JButton checkQuestionType = new JButton();
    JButton Reset = new JButton();
    JLabel QuestionType = new JLabel();
    JLabel Creator = new JLabel();
    JLabel Approach = new JLabel();


    public LSATLR(){
        JFrame frame = new JFrame();
        Font font = new Font("AppleGothic", Font.BOLD, 14);

        Font createrfont = new Font("AppleGothic", Font.ITALIC, 10);
        Creator.setText("Created by Frederick Liu, more features to come...");
        Creator.setBounds(240,460,300,20);
        Creator.setFont(createrfont);

        Welcome.setText("Check your LSAT Logic Reasoning Question Type: ");
        Welcome.setBounds(30,30,400,30);
        Welcome.setFont(font);

        userInputText.setBounds(100,80,300,200);
        userInputText.setBorder(new TitledBorder(new EtchedBorder(), "Question: "));
        userInputText.setLineWrap(true);
        userInputText.setWrapStyleWord(true);
        userInputText.setToolTipText("Please enter your LSAT Reason and Argument Question");
        userInputText.setFont(font);

        checkQuestionType.setBounds(100,300,120,30);
        checkQuestionType.addActionListener(this);
        checkQuestionType.setText("Check now!");
        checkQuestionType.setFont(font);
        checkQuestionType.setContentAreaFilled(false);
        checkQuestionType.setBorder(new LineBorder(Color.BLACK));
        checkQuestionType.addMouseListener(this);

        QuestionType.setText("Question Type: ");
        QuestionType.setBounds(20,330,400,60);
        QuestionType.setFont(font);

        Approach.setText("Approach: ");
        Approach.setBounds(20,370,450,100);
        Approach.setFont(font);

        Reset.setText("Reset");
        Reset.setBounds(250,300,120,30);
        Reset.setFont(font);
        Reset.setBorder(new LineBorder(Color.BLACK));
        Reset.setContentAreaFilled(false);
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Reset.setContentAreaFilled(true);
                Reset.setBackground(Color.lightGray);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Reset.setContentAreaFilled(false);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                Reset.setBackground(Color.GRAY);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Reset.setBackground(Color.lightGray);
            }
        });
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userInputText.setText("");
                checkQuestionType.setText("Check now!");
                QuestionType.setText("Question Type: ");
                Approach.setText("Approach: ");
            }
        });

        frame.add(Approach);
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
        String[] NecessaryAssump = {"depend", "depends", "requires", "assumes", "presupposes"};
        String[] SufficientAssump = {"allows", "enables", "logically", "inferred"};
        String[] Strengthen = {"strengthen", "most strongly supports the argument", "justifies", "justify", "support"};
        String[] Weaken = {"weaken", "call into question", "counter", "undermine", "doubt", "incomplete"};
        String[] Flaw = {"flaw", "error", "vulnerable", "criticism", "questionable", "fallacious", "unwarranted", "weakness"};
        String[] EvaluateTheArgument = {"evaluating", "evaluate"};
        String[] MethodOfReason = {"method of reasoning", "proceeds", "employs", "strategies", "techniques"};
        String[] Inference = {"most reasonably be concluded", "must be true", "most strongly supported", "cannot be true", "inferred", "also", "properly", "logically follows"};
        String[] RoleOfStatement = {"roles", "role", "figures", "plays"};
        String[] ParallelReasoning = {"parallel", "similar", "structure", "logical structure", "pattern", "pattern of reasoning"};
        String[] PointAtIssue = {"disagree", "point at issue between", "between", "disagree on", "disagree over"};
        String[] Principle = {"principle", "principles", "propositions", "proposition"};
        String[] ResolveParadox = {"helps to resolve", "resolve", "inconsistency", "reconcile", "discrepancy", "paradox", "apparent", "contradiction", "contributes to an explanation"};
        String[]IdentifyConclusion = {"accurately expresses the conclusion", "accurately", "conclusion drawn", "drawn"};

        //Then check the key Words
        for (i = 0; i < NecessaryAssump.length; i++){
            if (UserInputs.contains(NecessaryAssump[i])) {
                QuestionType.setText("Question Type: Necessary Assumption");
                Approach.setText("<html>Approach: Negate each answer choice. After negation, the CORRECT answer will be the one that destroys the argument's validity <html>");
            }
        }

        for (i = 0; i < SufficientAssump.length; i++){
            if (UserInputs.contains(SufficientAssump[i])) {
                QuestionType.setText("Question Type: Sufficient Assumption");
                Approach.setText("<html>Approach: The CORRECT answer will be the one that guarantees conclusion’s validity by linking evidence with conclusion. <html>");
            }
        }

        for (i = 0; i < Strengthen.length; i++){
            if (UserInputs.contains(Strengthen[i])) {
                QuestionType.setText("Question Type: Strengthen");
                Approach.setText("<html>Approach: The CORRECT answer will be the one that <br/>" +
                        "shows the topic in the evidence is related to the topic in the conclusion and that " +
                        "a potential alternate cause isn’t actually the cause. " +
                        "It makes conclusion more likely to be valid <html>");
            }
        }

        for (i = 0; i < Weaken.length; i++){
            if (UserInputs.contains(Weaken[i])) {
                QuestionType.setText("Question Type: Weaken");
                Approach.setText("<html>Approach: The CORRECT answer will be the one that <br/>" +
                        "shows that the sample isn’t big enough or relevant enough and that " +
                        "there could be an alternate cause. It makes conclusion more likely to be invalid. <html>");
            }
        }

        for (i = 0; i < Flaw.length; i++){
            if (UserInputs.contains(Flaw[i])) {
                QuestionType.setText("Question Type: Flaw");
                Approach.setText("<html>Approach: Identify the main conclusion and supports, then check for common flaws which are: " +
                        "1. Causation/correlation, 2. Sampling Flaw 3. Ad hominem " +
                        "4. Quantity versus percent 5. Lack of evidence as proof 6. false dichotomy" +
                        "7. Circular reasoning 8. Equivocation <html>");
            }
        }


        for (i = 0; i < EvaluateTheArgument.length; i++){
            if (UserInputs.contains(EvaluateTheArgument[i])) {
                QuestionType.setText("Question Type: Evaluate the Argument");

                Approach.setText("<html>Approach: Determine what matters for the argument’s validity, what would strengthen/weaken it if true or not. <html>");
            }
        }


        for (i = 0; i < MethodOfReason.length; i++){
            if (UserInputs.contains(MethodOfReason[i])) {
                QuestionType.setText("Question Type: Method of Reason");
                Approach.setText("<html>Approach: Paraphrasing how the argument’s evidence and support justifies its conclusion. " +
                        "Look for common argument structures. " +
                        "Look for answers that describe the structure and eliminate those that misstate the conclusion. <html>");
            }
        }

        for (i = 0; i < Inference.length; i++){
            if (UserInputs.contains(Inference[i])) {
                QuestionType.setText("Question Type: Inference");
                Approach.setText("<html>Approach: The CORRECT answer will be the one that's " +
                        "supported by information in the stimulus. INCORRECT answers are choices that are outside the scope or with language stronger than the passage's language.<html>");
            }
        }

        for (i = 0; i < RoleOfStatement.length; i++){
            if (UserInputs.contains(RoleOfStatement[i])) {
                QuestionType.setText("Question Type: Role of Statement");
                Approach.setText("<html>Approach: Categorize the statement and predict the answer. INCORRECT answers are ones that are " +
                        "partly correct or at a wrong point of view<html>");
            }
        }

        for (i = 0; i < ParallelReasoning.length; i++){
            if (UserInputs.contains(ParallelReasoning[i])) {
                QuestionType.setText("Question Type: Parallel Reasoning/Flaw");
                Approach.setText("<html>Approach: The CORRECT answer will be the one that " +
                        "have the same kind of conclusion and the same kind of evidence as the passage." +
                        "If multiple conditionals, create formal logic diagram. <html>");
            }
        }

        for (i = 0; i < PointAtIssue.length; i++){
            if (UserInputs.contains(PointAtIssue[i])) {
                QuestionType.setText("Question Type: Point at Issue");
                Approach.setText("<html>Approach: The CORRECT answer will be the one that " +
                        "both people express opinions on, and expressed opinions are in opposition to one another." +
                        "INCORRECT answers are claims about which both speakers agree or one or both speakers don’t have an opinion. <html>");
            }
        }

        for (i = 0; i < Principle.length; i++){
            if (UserInputs.contains(Principle[i])) {
                QuestionType.setText("Question Type: Principle");
                Approach.setText("<html>Approach: CORRECT answers are usually ones that parallels the argument or serve as a strengthener of the principle. " +
                        "INCORRECT answers are ones that usually strays from the situation, could be true but doesn’t necessarily conform, or resulted from a faulty deduction. <html>");
            }
        }

        for (i = 0; i < ResolveParadox.length; i++){
            if (UserInputs.contains(ResolveParadox[i])) {
                QuestionType.setText("Question Type: Resolve the Paradox");
                Approach.setText("<html>Approach: The CORRECT answer will be the one that " +
                        "points out a way for everything in stimulus to be true at same time. <html>");
            }
        }

        for (i = 0; i < IdentifyConclusion.length; i++){
            if (UserInputs.contains(IdentifyConclusion[i])) {
                QuestionType.setText("Question Type: Identify Conclusion");
                Approach.setText("<html>Approach: The CORRECT answer will be the one that accurately paraphrases the main conclusion that you identified. <html>");
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        checkQuestionType.setBackground(Color.GRAY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        checkQuestionType.setBackground(Color.lightGray);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        checkQuestionType.setContentAreaFilled(true);
        checkQuestionType.setBackground(Color.lightGray);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        checkQuestionType.setContentAreaFilled(false);
    }

}
