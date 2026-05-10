package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PencilOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10f, 10f)
                lineToRelative(-6.157f, 6.162f)
                arcToRelative(2f, 2f, 0f, false, false, -.5f, .833f)
                lineToRelative(-1.322f, 4.36f)
                arcToRelative(.5f, .5f, 0f, false, false, .622f, .624f)
                lineToRelative(4.358f, -1.323f)
                arcToRelative(2f, 2f, 0f, false, false, .83f, -.5f)
                lineTo(14f, 13.982f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12.829f, 7.172f)
                lineToRelative(4.359f, -4.346f)
                arcToRelative(1f, 1f, 0f, true, true, 3.986f, 3.986f)
                lineToRelative(-4.353f, 4.353f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 5f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.PencilOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PencilOff: ImageVector
    @Composable get() = PencilOffDefinition.asImageVector()
