package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Helicopter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(5.865f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 17f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                arcToRelative(8f, 6f, 0f, false, false, -8f, -6f)
                arcToRelative(6f, 5f, 0f, false, false, -6f, 5f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 3f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 13f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.HelicopterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Helicopter: ImageVector
    @Composable get() = HelicopterDefinition.asImageVector()
