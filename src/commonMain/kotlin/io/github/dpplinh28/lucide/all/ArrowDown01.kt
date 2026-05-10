package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDown01") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(3f, 16f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 20f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.0f, 2.0f, 0f, false, true, 0.0f, 2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.0f, 2.0f, 0f, false, true, -0.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.0f, 2.0f, 0f, false, true, -0.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.0f, 2.0f, 0f, false, true, 0.0f, -2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 20f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 20f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.ArrowDown01Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDown01: ImageVector
    @Composable get() = ArrowDown01Definition.asImageVector()
