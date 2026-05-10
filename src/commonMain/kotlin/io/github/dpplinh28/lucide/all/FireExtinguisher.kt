package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FireExtinguisher") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 6.5f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 18f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 3f)
                horizontalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 3f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 13f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 10f)
                arcToRelative(4f, 4f, 0f, false, false, -8f, 0f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                close()
            }
}

public val LucideIcons.All.FireExtinguisherDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FireExtinguisher: ImageVector
    @Composable get() = FireExtinguisherDefinition.asImageVector()
