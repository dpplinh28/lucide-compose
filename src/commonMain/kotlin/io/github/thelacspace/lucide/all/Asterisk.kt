package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Asterisk") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.196f, 9f)
                lineTo(6.804f, 15f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.804f, 9f)
                lineToRelative(10.392f, 6f)
            }
}

public val LucideIcons.All.AsteriskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Asterisk: ImageVector
    @Composable get() = AsteriskDefinition.asImageVector()
