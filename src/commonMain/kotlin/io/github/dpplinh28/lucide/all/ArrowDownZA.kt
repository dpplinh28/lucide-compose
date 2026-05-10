package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownZA") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(3f, 16f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 4f)
                horizontalLineToRelative(5f)
                lineToRelative(-5f, 6f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 20f)
                verticalLineToRelative(-3.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                verticalLineTo(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 18f)
                horizontalLineToRelative(-5f)
            }
}

public val LucideIcons.All.ArrowDownZADefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownZA: ImageVector
    @Composable get() = ArrowDownZADefinition.asImageVector()
