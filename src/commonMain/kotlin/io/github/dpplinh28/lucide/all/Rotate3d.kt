package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rotate3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15.194f, 13.707f)
                lineToRelative(3.814f, 1.86f)
                lineToRelative(-1.86f, 3.814f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.47214f, 7.52786f)
                arcTo(5f, 10f, 0f, true, false, 13f, 21.79796f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.79796f, 11f)
                arcTo(10f, 5f, 0f, true, false, 19f, 15.57071f)
            }
}

public val LucideIcons.All.Rotate3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rotate3d: ImageVector
    @Composable get() = Rotate3dDefinition.asImageVector()
