package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BicepsFlexed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.409f, 13.017f)
                arcTo(5f, 5f, 0f, false, true, 22f, 15f)
                curveToRelative(0f, 3.866f, -4f, 7f, -9f, 7f)
                curveToRelative(-4.077f, 0f, -8.153f, -.82f, -10.371f, -2.462f)
                curveToRelative(-.426f, -.316f, -.631f, -.832f, -.62f, -1.362f)
                curveTo(2.118f, 12.723f, 2.627f, 2f, 10f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                curveToRelative(-1.105f, 0f, -1.64f, -.444f, -2f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 14f)
                arcToRelative(5f, 5f, 0f, false, false, -7.584f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.964f, 6.825f)
                curveTo(8.019f, 7.977f, 9.5f, 13f, 8f, 15f)
            }
}

public val LucideIcons.All.BicepsFlexedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BicepsFlexed: ImageVector
    @Composable get() = BicepsFlexedDefinition.asImageVector()
