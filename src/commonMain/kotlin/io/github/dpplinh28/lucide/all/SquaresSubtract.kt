package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquaresSubtract") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 22f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 22f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 14f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 20f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
}

public val LucideIcons.All.SquaresSubtractDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquaresSubtract: ImageVector
    @Composable get() = SquaresSubtractDefinition.asImageVector()
