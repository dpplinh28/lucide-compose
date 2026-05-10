package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Volume2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 4.702f)
                arcToRelative(.705f, .705f, 0f, false, false, -1.203f, -.498f)
                lineTo(6.413f, 7.587f)
                arcTo(1.4f, 1.4f, 0f, false, true, 5.416f, 8f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2.416f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, .997f, .413f)
                lineToRelative(3.383f, 3.384f)
                arcTo(.705f, .705f, 0f, false, false, 11f, 19.298f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 9f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.364f, 18.364f)
                arcToRelative(9f, 9f, 0f, false, false, 0f, -12.728f)
            }
}

public val LucideIcons.All.Volume2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Volume2: ImageVector
    @Composable get() = Volume2Definition.asImageVector()
