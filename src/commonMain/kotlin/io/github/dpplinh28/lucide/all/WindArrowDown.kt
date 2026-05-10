package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WindArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.8f, 21.6f)
                arcTo(2f, 2f, 0f, true, false, 14f, 18f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f, 10f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 2f, 4f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 6f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.WindArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WindArrowDown: ImageVector
    @Composable get() = WindArrowDownDefinition.asImageVector()
