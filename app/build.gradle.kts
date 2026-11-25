plugins {
    alias(libs.plugins.android.application)
    // Este plugin es obligatorio para que funcionen los @Composable
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.10"
}

android {
    // CAMBIA: Nombre del paquete del proyecto
    namespace = "com.example.pocketpoker"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.example.pocketpoker"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // Activa Jetpack Compose en el proyecto
    buildFeatures {
        compose = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    // SIEMPRE - DEPENDENCIAS BASE DE COMPOSE
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.compose.material3:material3:1.2.0")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")

    // 1. La primera permite usar NavHost, rememberNavController() y navegar entre pantallas.
    // 2. La segunda permite usar viewModel() dentro de las pantallas @Composable.
    implementation("androidx.navigation:navigation-compose:2.8.3")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}