package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scale") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 8f)
                lineToRelative(3f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, -6f, 0f)
                close()
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                horizontalLineToRelative(1f)
                arcToRelative(17f, 17f, 0f, false, false, 8f, -2f)
                arcToRelative(17f, 17f, 0f, false, false, 8f, 2f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 8f)
                lineToRelative(3f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, -6f, 0f)
                close()
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineToRelative(10f)
            }
}

public val LucideIcons.All.ScaleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scale: ImageVector
    @Composable get() = ScaleDefinition.asImageVector()
