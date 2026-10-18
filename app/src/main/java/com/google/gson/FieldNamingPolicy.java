package com.google.gson;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public enum FieldNamingPolicy implements c {
    IDENTITY { // from class: com.google.gson.FieldNamingPolicy.1
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public String translateName(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.gson.FieldNamingPolicy.2
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.FieldNamingPolicy.3
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), ' '));
        }
    },
    UPPER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.4
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.5
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.gson.FieldNamingPolicy.6
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.google.gson.FieldNamingPolicy.7
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.c
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    public static String separateCamelCase(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    @Override // com.google.gson.c
    public List alternateNames(Field field) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.gson.c
    public abstract /* synthetic */ String translateName(Field field);
}
