package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Nfc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 8.32f)
                arcToRelative(7.43f, 7.43f, 0f, false, true, 0f, 7.36f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.46f, 6.21f)
                arcToRelative(11.76f, 11.76f, 0f, false, true, 0f, 11.58f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.91f, 4.1f)
                arcToRelative(15.91f, 15.91f, 0f, false, true, .01f, 15.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.37f, 2f)
                arcToRelative(20.16f, 20.16f, 0f, false, true, 0f, 20f)
            }
}

public val LucideIcons.All.NfcDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Nfc: ImageVector
    @Composable get() = NfcDefinition.asImageVector()
