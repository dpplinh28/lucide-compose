package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SmartphoneNfc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 8.32f)
                arcToRelative(7.43f, 7.43f, 0f, false, true, 0f, 7.36f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.46f, 6.21f)
                arcToRelative(11.76f, 11.76f, 0f, false, true, 0f, 11.58f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.91f, 4.1f)
                arcToRelative(15.91f, 15.91f, 0f, false, true, .01f, 15.8f)
            }
}

public val LucideIcons.All.SmartphoneNfcDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SmartphoneNfc: ImageVector
    @Composable get() = SmartphoneNfcDefinition.asImageVector()
