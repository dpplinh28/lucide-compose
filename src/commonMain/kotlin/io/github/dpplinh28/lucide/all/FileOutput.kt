package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileOutput") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.226f, 20.925f)
                arcTo(2f, 2f, 0f, false, false, 6f, 22f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3.127f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 11f)
                lineToRelative(-3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 17f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(10f)
            }
}

public val LucideIcons.All.FileOutputDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileOutput: ImageVector
    @Composable get() = FileOutputDefinition.asImageVector()
