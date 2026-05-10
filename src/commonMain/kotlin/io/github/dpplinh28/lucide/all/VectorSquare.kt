package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VectorSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.5f, 7f)
                arcToRelative(24f, 24f, 0f, false, true, 0f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f, 7f)
                arcToRelative(24f, 24f, 0f, false, false, 0f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 19.5f)
                arcToRelative(24f, 24f, 0f, false, false, 10f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 4.5f)
                arcToRelative(24f, 24f, 0f, false, true, 10f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.VectorSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VectorSquare: ImageVector
    @Composable get() = VectorSquareDefinition.asImageVector()
