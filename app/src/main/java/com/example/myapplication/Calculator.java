package com.example.myapplication;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
    static ArrayList<StringBuilder> listOperands;
    static Stack<StringBuilder> operationStack;
    static Stack<StringBuilder> valuesStack;

    public static void Init() {
        operationStack = new Stack<>();
        valuesStack = new Stack<>();
    }

    public static int Priority(StringBuilder o) {
        int r=-1;
        switch (o.toString())
        {
            case "(":
                r=0;
                break;
            case "+":
            case "-":
                r=1;
                break;
            case "*":
            case "/":
                r=2;
                break;
            case "^":
                r=3;
        }
        return r;
    }

    public static void execution() {
        double a1, a2, r;
        StringBuilder v1, v2;
        StringBuilder op;

        v2 = valuesStack.pop();
        v1 = valuesStack.pop();
        op = operationStack.pop();

        a1 = Double.parseDouble(v1.toString());
        a2 = Double.parseDouble(v2.toString());

        r = 0.0;
        switch (op.toString())
        {
            case "+":
                r= additionValues(a1, a2);
                break;
            case "-":
                r=subtractionValues(a1, a2);
                break;
            case "*":
                r=multiplicationValues(a1, a2);
                break;
            case "/":
                r=divisionValues(a1, a2);
                break;
            case "^":
                r=Math.pow(a1, a2);
                break;
        }

        v1 = new StringBuilder(Double.toString(r));
        valuesStack.push(v1);

    }

    public static double divisionValues(double a1, double a2) {
        return  a1 / a2;
    }

    public static double multiplicationValues(double a1, double a2) {
        return a1 * a2;
    }

    public static double subtractionValues(double a1, double a2) {
        return a1 - a2;
    }

    public static double additionValues(double a1, double a2) {
        return a1 + a2;
    }

    public static void calculate(String F) {
        int i;
        StringBuilder current, top;

        Init();
        parse(F);

        for (i = 0; i <= listOperands.size() - 1; i++) {
            current = listOperands.get(i);
            switch (current.toString()) {
                case "(":
                    operationStack.push(current);
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    if (operationStack.isEmpty()) {
                        operationStack.push(current);
                        break;
                    }
                    top = operationStack.peek();
                    if (Priority(current) > Priority(top)) {
                        operationStack.push(current);
                        break;
                    } else {
                        execution();
                        operationStack.push(current);
                        break;
                    }
                case ")":
                    while (true) {
                        top = operationStack.peek();
                        if (top.toString().equals("(")) {
                            top = operationStack.pop();
                            break;
                        }
                        execution();
                    }
                    break;
                default:
                    valuesStack.push(current);
            }
        }

        while (!operationStack.isEmpty()) {
            execution();
        }

    }

    public static void parse(String formula) {
        char s;
        int i;
        StringBuilder formulaString = normalisationString(formula);

        StringBuilder Tmp = new StringBuilder();
        listOperands = new ArrayList<>();
        for (i = 0; i < formulaString.length(); i++) {
            s = formulaString.charAt(i);
            switch (s) {
                case '+':
                case '*':
                case '^':
                case '/':
                case '(':
                case ')':
                    if (Tmp.length() > 0) {
                        listOperands.add(Tmp);
                        Tmp = new StringBuilder();
                    }
                    listOperands.add(new StringBuilder(Character.toString(s)));
                    break;
                case '-':
                    if (i == 0 || isOperation(formulaString.charAt(i - 1))) {
                        Tmp.append(s);
                    } else {
                        if (Tmp.length() > 0) {
                            listOperands.add(Tmp);
                            Tmp = new StringBuilder();
                        }

                        listOperands.add(new StringBuilder(Character.toString(s)));
                    }
                    break;
                default:
                    Tmp.append(s);
            }
        }
        if (Tmp.length() > 0) listOperands.add(Tmp);
    }

    private static StringBuilder normalisationString(String formula) {
        StringBuilder str = new StringBuilder(formula);
        int index = str.indexOf("\n");
        while (index >= 0) {
            str.deleteCharAt(index);
            index = str.indexOf("\n");
        }
        return str;
    }

    private static boolean isOperation(char s) {
        switch (s) {
            case '+':
            case '-':
            case '*':
            case '^':
            case '/':
            case '(':
            case ')':
                return true;
        }
        return false;
    }

}


