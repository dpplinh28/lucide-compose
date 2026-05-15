package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouseOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.218f, 18.218f)
                arcTo(7f, 7f, 0f, false, true, 5f, 15f)
                verticalLineTo(9f)
                arcToRelative(7f, 7f, 0f, false, true, .782f, -3.218f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 13.343f)
                verticalLineTo(9f)
                arcTo(7f, 7f, 0f, false, false, 8.56f, 2.902f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 22f)
                lineTo(2f, 2f)
            }
}

public val LucideIcons.All.MouseOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouseOff: ImageVector
    @Composable get() = MouseOffDefinition.asImageVector()
